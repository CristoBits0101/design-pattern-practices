package com.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.create("email");
        Notification sms = NotificationFactory.create("sms");
        System.out.println(email.send("Pedido confirmado."));
        System.out.println(sms.send("Pedido enviado."));
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

final class NotificationFactory {
    private NotificationFactory() {
    }

    public static Notification create(String channel) {
        return switch (channel) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Canal desconocido: " + channel);
        };
    }
}
