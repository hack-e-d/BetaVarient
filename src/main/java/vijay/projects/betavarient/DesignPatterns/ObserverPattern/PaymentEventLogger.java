package vijay.projects.betavarient.DesignPatterns.ObserverPattern;

public class PaymentEventLogger implements PaymentListener{

    public void logEvent() {
        System.out.println("Payment done!!!!");
    }

    @Override
    public void paymentMade(PaymentEvent paymentEvent) {
        logEvent();
    }
}
