package vijay.projects.betavarient.DesignPatterns.AdapterPattern;

import vijay.projects.betavarient.DesignPatterns.AdapterPattern.dependency.DependencyNotificationSender;
import vijay.projects.betavarient.DesignPatterns.AdapterPattern.main.AppNotificationSender;

public class AdapterMain {

    public static void main(String[] args) {
        AppNotificationSender sender = new AppNotificationSender(new DependencyNotificationSender());
    }

}
