package com.patterns.behavior.visitor.services.implementations;

import com.patterns.behavior.visitor.services.PaymentVisitor;

// Step 2.1: Create a class that implements PaymentStrategy
public class PayPalPayment implements PaymentVisitor {

    /**
     * Methods
     */

    // Step 2.2: Implement the pay method
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

}
