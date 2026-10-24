package com.patterns.structural.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void wrappersAccumulateWhileTheBaseStaysUnchanged() {
        Coffee plain = new PlainCoffee();
        Coffee decorated = new SugarDecorator(new MilkDecorator(plain));
        Coffee reversed = new MilkDecorator(new SugarDecorator(plain));

        assertEquals(200, plain.priceInCents());
        assertEquals("Café", plain.description());
        assertEquals(270, decorated.priceInCents());
        assertEquals("Café + leche + azúcar", decorated.description());
        assertEquals(270, reversed.priceInCents());
        assertEquals("Café + azúcar + leche", reversed.description());
    }
}
