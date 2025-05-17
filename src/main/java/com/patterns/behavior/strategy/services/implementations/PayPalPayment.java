package com.patterns.behavior.strategy.services.implementations;

import com.patterns.behavior.strategy.services.PaymentStrategy;

// Step 2.1: Create a class that implements PaymentStrategy
public class PayPalPayment implements PaymentStrategy {

    /**
     * Methods
     */

    // Step 2.2: Implement the pay method
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

}
