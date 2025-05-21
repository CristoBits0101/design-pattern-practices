package com.patterns.behavior.visitor.models;

import com.patterns.behavior.visitor.services.PaymentVisitor;

// Step 3.1: Create a context class
public class PaymentContext {

    /**
     * Attributes
     */

    // Step 3.2: Reference to a strategy
    private PaymentVisitor strategy;

    /**
     * Constructors
     */

    // Step 3.3: Create a constructor with strategy initial
    public PaymentContext(PaymentVisitor strategy) {
        this.strategy = strategy;
    }

    /**
     * Methods
     */

    // Step 3.4: Polimorphic method to set the pay strategy
    public void setStrategy(PaymentVisitor strategy) {
        this.strategy = strategy;
    }

    // Step 3.5: Execute payment method
    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
