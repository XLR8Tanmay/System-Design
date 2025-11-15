package DependencyInjection.Services.Order;

import DependencyInjection.Services.Notification.*;
import DependencyInjection.Services.Payment.*;

public class OrderService {
    public PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(int amount) {
        paymentService.processPayment(amount);
    }
}