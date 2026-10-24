package com.patterns.creational.factorymethod.products;

// Producto concreto para el canal de correo.
public final class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }
}
