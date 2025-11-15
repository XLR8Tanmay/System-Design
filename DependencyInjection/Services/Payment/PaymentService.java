package DependencyInjection.Services.Payment;

import DependencyInjection.Interfaces.PaymentInterface;

public class PaymentService implements PaymentInterface {
    public PaymentService() {
        System.out.println("Initializing PaymentService");
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Payment done using PaymentService of amount:" + amount);
    }
}