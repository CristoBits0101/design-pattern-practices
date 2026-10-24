package com.patterns.creational.factorymethod.creators;

import com.patterns.creational.factorymethod.products.EmailNotification;
import com.patterns.creational.factorymethod.products.Notification;

public final class EmailNotificationService extends NotificationService {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
