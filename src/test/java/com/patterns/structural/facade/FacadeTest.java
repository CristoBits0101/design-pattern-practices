package com.patterns.structural.facade;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    @Test
    void oneCallCoordinatesBothComponents() {
        HomeTheater theater = new HomeTheater();

        assertEquals(List.of(
                "Televisión encendida", "Sonido encendido", "Película iniciada"),
                theater.watchMovie().lines().toList());
    }
}
