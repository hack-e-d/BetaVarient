package vijay.projects.betavarient.DesignPatterns.DecoratorPattern;

public class EmailSender implements NotificationSender {

    private NotificationSender sender;

    public EmailSender(NotificationSender sender) {
        this.sender = sender;
    }

    @Override
    public void send() {
        if (sender != null) sender.send();
        System.out.println("email Sent!!!");
    }
}
