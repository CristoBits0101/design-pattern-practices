package com.patterns.creational.factory;

import com.patterns.creational.factory.factories.PriceFactory;

public class Main {

    // Step 4: Create a main method to test the factory
    public static void main(String[] args) {
        // Step 1: Create a PriceFactory object
        PriceFactory priceFactory = new PriceFactory("EUROPE");

    }

}
