package com.patterns.behavior.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {
    @Test
    void replacingTheStrategyChangesTheSameContext() {
        PaymentContext context = new PaymentContext(new CardPayment());
        assertEquals("Tarjeta: 100.0", context.pay(100));

        context.setStrategy(new PayPalPayment());
        assertEquals("PayPal: 50.0", context.pay(50));
    }
}
