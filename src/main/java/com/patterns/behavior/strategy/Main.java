package com.patterns.behavior.strategy;

import java.util.Objects;

/*
 * Problema: cambiar el método de pago sin modificar el código que lo utiliza.
 * Idea: el contexto delega el pago en una estrategia intercambiable.
 * Observa: el mismo contexto cambia de tarjeta a PayPal durante la ejecución.
 */
interface PaymentStrategy {
    String pay(double amount);
}

final class CardPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Tarjeta: " + amount;
    }
}

final class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "PayPal: " + amount;
    }
}

final class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public String pay(double amount) {
        return strategy.pay(amount);
    }
}

public class Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CardPayment());
        System.out.println(context.pay(100));

        context.setStrategy(new PayPalPayment());
        System.out.println(context.pay(50));
    }
}
