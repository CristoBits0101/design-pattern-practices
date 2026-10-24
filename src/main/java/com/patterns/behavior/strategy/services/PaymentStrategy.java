package com.patterns.behavior.strategy.services;

// Contrato común para los algoritmos de pago intercambiables.
@FunctionalInterface
public interface PaymentStrategy {

    void pay(double amount);
}
