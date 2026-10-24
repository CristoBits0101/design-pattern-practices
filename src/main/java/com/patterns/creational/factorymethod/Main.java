package com.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNotificationService();
        NotificationService sms = new SmsNotificationService();
        System.out.println(email.notifyUser("Pedido confirmado."));
        System.out.println(sms.notifyUser("Pedido enviado."));
    }
}

interface Notification {
    String send(String message);
}

final class EmailNotification implements Notification {
    @Override
    public String send(String message) {
        return "EMAIL: " + message;
    }
}

final class SmsNotification implements Notification {
    @Override
    public String send(String message) {
        return "SMS: " + message;
    }
}

abstract class NotificationService {
    public final String notifyUser(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacío.");
        }
        return createNotification().send(message);
    }

    protected abstract Notification createNotification();
}

final class EmailNotificationService extends NotificationService {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}

final class SmsNotificationService extends NotificationService {
    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}
