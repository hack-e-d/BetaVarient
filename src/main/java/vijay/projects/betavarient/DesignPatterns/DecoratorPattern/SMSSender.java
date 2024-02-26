package vijay.projects.betavarient.DesignPatterns.DecoratorPattern;

public class SMSSender implements NotificationSender {

    public NotificationSender sender;

    public SMSSender( NotificationSender sender) {
        this.sender = sender;
    }
    @Override
    public void send() {
        if (sender != null) sender.send();
        System.out.println("SMS Sent !!!");
    }
}
