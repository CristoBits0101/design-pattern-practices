package com.patterns.behavior.visitor.services;

// Step 1.1: Create a strategy interface
public interface PaymentStrategy {

    /**
     * Methods
     */

    // Step 1.2: Define a method for paying
    void pay(double amount);

}
