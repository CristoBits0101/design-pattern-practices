package com.patterns.creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    @Test
    void changingTheBuilderLeavesPreviousCarsIntact() {
        CarBuilder builder = new CarBuilder("Toyota");
        Car first = builder.withDoors(4).withColor("rojo").build();
        Car second = builder.withDoors(2).withColor("azul").build();

        assertNotSame(first, second);
        assertEquals("Toyota", first.getBrand());
        assertEquals("Toyota", second.getBrand());
        assertEquals(4, first.getDoors());
        assertEquals("rojo", first.getColor());
        assertEquals(2, second.getDoors());
        assertEquals("azul", second.getColor());
    }
}
