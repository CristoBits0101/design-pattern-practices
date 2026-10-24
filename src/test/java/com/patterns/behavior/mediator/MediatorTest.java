package com.patterns.behavior.mediator;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {
    @Test
    void theRoomDeliversMessagesToEveryoneExceptTheSender() {
        ChatRoom room = new ChatRoom();
        User ana = new User("Ana", room);
        User luis = new User("Luis", room);
        User eva = new User("Eva", room);

        ana.send("Hola");
        assertTrue(ana.getMessages().isEmpty());
        assertEquals(List.of("Ana: Hola"), luis.getMessages());
        assertEquals(List.of("Ana: Hola"), eva.getMessages());

        luis.send("Respuesta");
        assertEquals(List.of("Luis: Respuesta"), ana.getMessages());
        assertEquals(List.of("Ana: Hola"), luis.getMessages());
        assertEquals(List.of("Ana: Hola", "Luis: Respuesta"), eva.getMessages());
    }
}
