package DependencyInjection.Services.Notification;

public class EmailNotificationService extends NotificationService {
    public EmailNotificationService() {
        System.out.println("Initializing EmailNotificationService");
    }

    @Override
    public void processNotification() {
        System.out.println("Email sent to user using EmailNotificationService");
    }
}