package com.patterns.behavior.strategy.models;

import java.util.Objects;

import com.patterns.behavior.strategy.services.PaymentStrategy;

// El contexto utiliza una estrategia sin conocer su implementación concreta.
public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        setStrategy(strategy);
    }

    // Permite sustituir el algoritmo de pago durante la ejecución.
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "La estrategia es obligatoria.");
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
