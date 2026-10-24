package com.patterns.creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {
    @Test
    void argumentSelectsTheProduct() {
        Notification email = NotificationFactory.create("email");
        Notification sms = NotificationFactory.create("sms");

        assertEquals("EMAIL: Hola", email.send("Hola"));
        assertEquals("SMS: Hola", sms.send("Hola"));
        assertThrows(IllegalArgumentException.class, () -> NotificationFactory.create("unknown"));
    }
}
