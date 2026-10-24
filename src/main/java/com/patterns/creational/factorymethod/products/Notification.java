package com.patterns.creational.factorymethod.products;

// Producto: todos los canales ofrecen la misma operación.
public interface Notification {

    void send(String message);
}
