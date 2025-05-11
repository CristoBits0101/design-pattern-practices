package com.patterns.creational.factory.services;

// Step 2: Create a concrete class for the Price
public class PriceServiceUSDImpl implements PriceService {
    
    @Override
    public double getPrice() {
        return 1.13;
    }

}
