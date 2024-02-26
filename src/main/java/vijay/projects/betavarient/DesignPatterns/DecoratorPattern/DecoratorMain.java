package vijay.projects.betavarient.DesignPatterns.DecoratorPattern;

public class DecoratorMain {

    public static void main(String[] args) {
        NotificationSender sender = new EmailSender(new SMSSender(null));
        NotificationSender sender1 = new SMSSender(new EmailSender(null));
        NotificationSender smsSenders = new SMSSender(new SMSSender(new SMSSender(new SMSSender(null))));

        sender.send();
        sender1.send();
        smsSenders.send();
    }
}
