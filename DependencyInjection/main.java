package DependencyInjection;

import DependencyInjection.Services.Notification.*;
import DependencyInjection.Services.Order.*;
import DependencyInjection.Services.Payment.*;

class Main {
    public static void main(String args[]) {
        PaymentService StripePaymentService = new StripePaymentService(); 
        OrderService order = new OrderService(StripePaymentService); // Injecting StripePaymentService Dependency
        order.makePayment(500);
    }
}

/*
To compile:
javac -d out $(find . -name "*.java")

To run:
java -cp out DependencyInjection.Main 
*/