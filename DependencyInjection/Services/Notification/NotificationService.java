package DependencyInjection.Services.Notification;

import DependencyInjection.Interfaces.NotificationInterface;

public class NotificationService implements NotificationInterface{
    public NotificationService() {
        System.out.println("Notification Service Initialized.");
    }

    @Override
    public void processNotification() {
        System.out.println("Base notification sent");
    }
}