package vijay.projects.betavarient.DesignPatterns.ObserverPattern;

@FunctionalInterface
public interface PaymentListener {
    void paymentMade(PaymentEvent paymentEvent);
}
