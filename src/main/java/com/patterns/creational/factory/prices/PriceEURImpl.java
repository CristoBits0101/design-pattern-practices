package com.patterns.creational.factory.prices;

// Step 2: Create a concrete class for the Price
public class PriceEURImpl implements Price {

    @Override
    public double getPrice() {
        return 1;
    }

}
