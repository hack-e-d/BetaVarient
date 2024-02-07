package vijay.projects.betavarient.DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject{

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay() {
        triggerEvent();
    }

    private void triggerEvent() {
        PaymentEvent paymentEvent = new PaymentEvent(this);

        paymentListeners.forEach(p -> p.paymentMade(paymentEvent));
    }
    public void registerPaymentListener(PaymentListener paymentListener) {
        paymentListeners.add(paymentListener);
    }
    @Override
    public void unregisterPaymentListener(PaymentListener paymentListener) {
        paymentListeners.remove(paymentListener);
    }
}
