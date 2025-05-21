package com.patterns.behavior.visitor.services.implementations;

import com.patterns.behavior.visitor.services.PaymentStrategy;

// Step 2.1: Create a class that implements PaymentStrategy
public class CreditCardPayment implements PaymentStrategy {

    /**
     * Methods
     */

    // Step 2.2: Implement the pay method
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

}
