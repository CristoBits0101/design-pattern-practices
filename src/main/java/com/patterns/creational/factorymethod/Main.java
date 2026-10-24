package com.patterns.creational.factorymethod;

import com.patterns.creational.factorymethod.creators.EmailNotificationService;
import com.patterns.creational.factorymethod.creators.NotificationService;
import com.patterns.creational.factorymethod.creators.SmsNotificationService;

public class Main {

    public static void main(String[] args) {
        // Elegimos el creador. Su método de fábrica decide el producto.
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SmsNotificationService();

        // Ambos reutilizan la validación y el envío definidos en la clase padre.
        emailService.notifyUser("Tu pedido ha sido confirmado.");
        smsService.notifyUser("Tu pedido está en camino.");
    }
}
