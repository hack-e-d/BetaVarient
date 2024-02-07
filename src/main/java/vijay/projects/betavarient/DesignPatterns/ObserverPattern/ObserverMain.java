package vijay.projects.betavarient.DesignPatterns.ObserverPattern;

public class ObserverMain {

    public static void main(String[] args) {

        PaymentManager paymentManager = new PaymentManager();

        PaymentListener notificationManager = new NotificationManager();
        PaymentListener paymentEventLogger = new PaymentEventLogger();

        paymentManager.registerPaymentListener(notificationManager);
        paymentManager.registerPaymentListener(paymentEventLogger);

        paymentManager.pay();

        paymentManager.unregisterPaymentListener(paymentEventLogger);

        paymentManager.pay();
    }
}
