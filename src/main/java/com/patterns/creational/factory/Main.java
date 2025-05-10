package com.patterns.creational.factory;

import com.patterns.creational.factory.factories.PriceFactory;

public class Main {

    // Step 4.1: Create a main method to test the factory
    public static void main(String[] args) {

        // Step 4.2: Create a PriceFactory object
        PriceFactory priceFactory = new PriceFactory("EUROPE");
        System.out.println("Price in EUROPE: " + priceFactory.getPrice());

        // Step 4.3: Create another PriceFactory object
        PriceFactory priceFactory2 = new PriceFactory("USA");
        System.out.println("Price in USA: " + priceFactory2.getPrice());

    }

}
