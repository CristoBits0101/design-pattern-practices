package com.patterns.creational.factory.factories;

import com.patterns.creational.factory.services.PriceService;
import com.patterns.creational.factory.services.PriceServiceEURImpl;
import com.patterns.creational.factory.services.PriceServiceUSDImpl;

// Step 3.1: Create a factory class to generate the Price objects
public class PriceFactory {

    /**
     * Attributes
     */

    // Step 3.2: Create a private price object
    PriceService price;

    /**
     * Constructors
     */

    // Step 3.3: Prevent instantiation of empty constructor
    @SuppressWarnings("unused")
    private PriceFactory() {
    }

    // Step 3.4: Create a constructor to get the Price object
    public PriceFactory(String country) {

        price = switch (country.toUpperCase()) {
            case "USA" -> new PriceServiceUSDImpl();
            case "EUROPE" -> new PriceServiceEURImpl();
            default -> throw new IllegalArgumentException("Country not supported!");
        };

    }

    /**
     * Methods
     */

    // Step 3.5: Create a method to get the Price object
    public double getPrice() {
        return price.getPrice();
    }

}
