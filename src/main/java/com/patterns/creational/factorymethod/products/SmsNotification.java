package com.patterns.creational.factorymethod.products;

// Producto concreto para el canal SMS.
public final class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
