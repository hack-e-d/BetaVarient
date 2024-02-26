package vijay.projects.betavarient.DesignPatterns.AdapterPattern.main;

import vijay.projects.betavarient.DesignPatterns.AdapterPattern.dependency.DependencyNotificationSender;

public class AppNotificationSender implements NotificationSender {

    private final DependencyNotificationSender dependencyNotificationSender;

    public AppNotificationSender(DependencyNotificationSender dependencyNotificationSender) {
        this.dependencyNotificationSender = dependencyNotificationSender;
    }


    @Override
    public void sendNotification() {
        dependencyNotificationSender.send();
    }
}
