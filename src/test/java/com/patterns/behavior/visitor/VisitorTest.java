package com.patterns.behavior.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    @Test
    void bothOperationsDispatchToTheConcreteElementThroughItsInterface() {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);
        ShapeVisitor area = new AreaVisitor();
        ShapeVisitor perimeter = new PerimeterVisitor();

        assertAll(
                () -> assertEquals(9 * Math.PI, circle.accept(area), 1e-9),
                () -> assertEquals(20, rectangle.accept(area), 1e-9),
                () -> assertEquals(6 * Math.PI, circle.accept(perimeter), 1e-9),
                () -> assertEquals(18, rectangle.accept(perimeter), 1e-9));
    }
}
