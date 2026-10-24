package com.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    @Test
    void creatorsReuseTheFlowWithDifferentProducts() {
        NotificationService email = new EmailNotificationService();
        NotificationService sms = new SmsNotificationService();

        assertEquals("EMAIL: Hola", email.notifyUser("Hola"));
        assertEquals("SMS: Hola", sms.notifyUser("Hola"));
    }

    @Test
    void theSharedFlowRejectsInvalidMessagesForBothCreators() {
        NotificationService[] services = {
            new EmailNotificationService(), new SmsNotificationService()
        };
        for (NotificationService service : services) {
            assertThrows(IllegalArgumentException.class, () -> service.notifyUser(null));
            assertThrows(IllegalArgumentException.class, () -> service.notifyUser("  "));
        }
    }
}
