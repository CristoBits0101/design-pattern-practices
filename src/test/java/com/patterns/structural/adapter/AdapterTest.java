package com.patterns.structural.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void theExpectedContractReachesTheIncompatibleComponent() {
        Switchable light = new LedAdapter(new LegacyLed());

        assertEquals("LED encendido a 5 V", light.turnOn());
    }
}
