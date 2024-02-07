package vijay.projects.betavarient.DesignPatterns.ObserverPattern;

public class NotificationManager implements PaymentListener{

    public void sendNotification() {
        System.out.println("Notification Sent!!!");
    }

    @Override
    public void paymentMade(PaymentEvent paymentEvent) {
        sendNotification();
    }
}
