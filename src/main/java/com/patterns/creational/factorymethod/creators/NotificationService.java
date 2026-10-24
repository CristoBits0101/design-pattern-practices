package com.patterns.creational.factorymethod.creators;

import com.patterns.creational.factorymethod.products.Notification;

// Creador: conserva el flujo común y delega la creación del producto.
public abstract class NotificationService {

    public final void notifyUser(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacío.");
        }

        // El flujo trabaja con el contrato sin conocer el canal concreto.
        Notification notification = createNotification();
        notification.send(message);
    }

    // Factory Method: cada subclase decide qué producto devuelve.
    protected abstract Notification createNotification();
}
