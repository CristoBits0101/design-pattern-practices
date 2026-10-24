package com.patterns.behavior.strategy;

import com.patterns.behavior.strategy.models.PaymentContext;
import com.patterns.behavior.strategy.services.implementations.CreditCardPayment;
import com.patterns.behavior.strategy.services.implementations.PayPalPayment;

public class Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        // Cambia el algoritmo utilizado por el mismo contexto.
        context.setStrategy(new PayPalPayment());
        context.executePayment(50.0);
    }
}
