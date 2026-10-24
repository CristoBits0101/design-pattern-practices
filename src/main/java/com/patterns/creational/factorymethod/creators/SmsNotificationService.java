package com.patterns.creational.factorymethod.creators;

import com.patterns.creational.factorymethod.products.Notification;
import com.patterns.creational.factorymethod.products.SmsNotification;

public final class SmsNotificationService extends NotificationService {

    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}
