package com.patterns;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import com.patterns.behavior.state.models.Phone;
import com.patterns.behavior.strategy.models.PaymentContext;
import com.patterns.behavior.strategy.services.Usuarios;
import com.patterns.behavior.strategy.services.UsuariosFicheroImpl;
import com.patterns.behavior.visitor.models.Circle;
import com.patterns.behavior.visitor.models.Rectangle;
import com.patterns.behavior.visitor.models.Shape;
import com.patterns.behavior.visitor.services.ShapeVisitor;
import com.patterns.behavior.visitor.services.implementations.AreaVisitor;
import com.patterns.behavior.visitor.services.implementations.PerimeterVisitor;
import com.patterns.creational.builder.builders.CarBuilder;
import com.patterns.creational.builder.models.Vehicle;
import com.patterns.creational.factory.factories.PriceFactory;
import com.patterns.creational.factory.services.PriceServiceEURImpl;
import com.patterns.creational.factory.services.PriceServiceUSDImpl;
import com.patterns.creational.factorymethod.creators.EmailNotificationService;
import com.patterns.creational.factorymethod.creators.NotificationService;
import com.patterns.creational.factorymethod.creators.SmsNotificationService;
import com.patterns.creational.singleton.models.Singleton;

@ResourceLock(Resources.SYSTEM_OUT)
class PatternRegressionTest {

    @Test
    void stateKeepsItsContextAcrossTransitions() {
        Phone phone = new Phone();

        List<String> messages = outputLines(() -> {
            phone.openCamera();
            phone.unlockPhone();
            phone.openCamera();
            phone.takePhoto();
            phone.takePhoto();
            phone.openCamera();
        });

        assertEquals(List.of(
                "You need to unlock the phone first.",
                "Unlocking phone...",
                "Opening camera...",
                "Taking photo...",
                "Photo taken. Returning to unlocked state.",
                "Opening camera..."), messages);
    }

    @Test
    void visitorDispatchesBothOperationsToEachConcreteShape() {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);
        ShapeVisitor area = new AreaVisitor();
        ShapeVisitor perimeter = new PerimeterVisitor();

        assertAll(
                () -> assertEquals(9 * Math.PI, circle.accept(area), 1e-9),
                () -> assertEquals(6 * Math.PI, circle.accept(perimeter), 1e-9),
                () -> assertEquals(20, rectangle.accept(area), 1e-9),
                () -> assertEquals(18, rectangle.accept(perimeter), 1e-9));
    }

    @Test
    void strategyUsesOnlyTheCurrentPaymentAlgorithm() {
        List<Double> cardCharges = new ArrayList<>();
        List<Double> paypalCharges = new ArrayList<>();
        PaymentContext context = new PaymentContext(cardCharges::add);

        context.executePayment(100);
        context.setStrategy(paypalCharges::add);
        context.executePayment(50);

        assertEquals(List.of(100.0), cardCharges);
        assertEquals(List.of(50.0), paypalCharges);
    }

    @Test
    void factoryMethodChoosesTheChannelThroughTheSharedFlow() {
        NotificationService email = new EmailNotificationService();
        NotificationService sms = new SmsNotificationService();

        List<String> messages = outputLines(() -> {
            email.notifyUser("Pedido confirmado.");
            sms.notifyUser("Pedido enviado.");
        });

        assertEquals(List.of("EMAIL: Pedido confirmado.", "SMS: Pedido enviado."), messages);
    }

    @Test
    void factoryMethodRejectsInvalidMessagesForEveryChannel() {
        List<NotificationService> services = List.of(
                new EmailNotificationService(), new SmsNotificationService());

        for (NotificationService service : services) {
            assertThrows(IllegalArgumentException.class, () -> service.notifyUser(null));
            assertThrows(IllegalArgumentException.class, () -> service.notifyUser("  \t"));
        }
    }

    @Test
    void simpleFactoryCreatesTheRequestedService() {
        assertInstanceOf(PriceServiceEURImpl.class, PriceFactory.create("europe"));
        assertInstanceOf(PriceServiceUSDImpl.class, PriceFactory.create("USA"));
        assertThrows(IllegalArgumentException.class, () -> PriceFactory.create("UNKNOWN"));
    }

    @Test
    void builderReuseDoesNotChangeCarsAlreadyBuilt() {
        CarBuilder builder = new CarBuilder("Toyota");
        Vehicle first = builder.setDoors(4).build();
        Vehicle second = builder.setDoors(2).build();

        assertNotSame(first, second);
        assertEquals(4, first.getDoors());
        assertEquals(2, second.getDoors());
        assertEquals("Toyota", first.getBrand());
        assertEquals("Toyota", second.getBrand());
    }

    @Test
    void singletonReturnsTheSameObjectAcrossThreads() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        CountDownLatch start = new CountDownLatch(1);

        try {
            List<Future<Singleton>> references = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                references.add(executor.submit(() -> {
                    start.await();
                    return Singleton.getInstance();
                }));
            }
            start.countDown();

            Singleton first = references.get(0).get(5, TimeUnit.SECONDS);
            for (Future<Singleton> reference : references) {
                assertSame(first, reference.get(5, TimeUnit.SECONDS));
            }
        } finally {
            start.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    void fileStrategyPreservesUsersAcrossInstances(@TempDir Path temporaryDirectory) {
        Path file = temporaryDirectory.resolve("usuarios.txt");
        Usuarios first = new UsuariosFicheroImpl(file);
        assertTrue(first.listar().isEmpty());
        first.crear("María");

        Usuarios second = new UsuariosFicheroImpl(file);
        assertEquals(List.of("María"), second.listar());
        second.crear("Óscar");

        assertEquals(List.of("María", "Óscar"), first.listar());
        assertEquals(List.of("María", "Óscar"), new UsuariosFicheroImpl(file).listar());
    }

    private static List<String> outputLines(Runnable action) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try (PrintStream captured = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(captured);
            action.run();
        } finally {
            System.setOut(original);
        }

        return buffer.toString(StandardCharsets.UTF_8).lines().toList();
    }
}
