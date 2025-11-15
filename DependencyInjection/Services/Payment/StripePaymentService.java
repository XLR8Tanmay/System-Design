package DependencyInjection.Services.Payment;

public class StripePaymentService extends PaymentService {
    public StripePaymentService() {
        System.out.println("Stripe Payment Service Activated");
    }
    @Override
    public void processPayment(int amount) {
        System.out.println("Paying using Stripe service of amount:"+amount);
    }
}