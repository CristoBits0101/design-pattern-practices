package com.patterns.behavior.strategy;

import com.patterns.behavior.strategy.models.PaymentContext;
import com.patterns.behavior.strategy.services.implementations.CreditCardPayment;
import com.patterns.behavior.strategy.services.implementations.PayPalPayment;

// Step 4.1: Create a main class to test the Strategy pattern
public class Main {

    public static void main(String[] args) {

        // Step 4.2: Use credit card strategy
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        // Step 4.3: Change to PayPal strategy at runtime
        context.setStrategy(new PayPalPayment());
        context.executePayment(50.0);
        
    }
}
