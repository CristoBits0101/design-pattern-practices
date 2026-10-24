package com.patterns.behavior.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    @Test
    void theSameActionUsesTheCurrentStateAndTransitionsBack() {
        Phone phone = new Phone();

        assertEquals("Teléfono desbloqueado.", phone.pressButton());
        assertEquals("Teléfono bloqueado.", phone.pressButton());
        assertEquals("Teléfono desbloqueado.", phone.pressButton());
    }
}
