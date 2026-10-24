package com.patterns.creational.factory;

import com.patterns.creational.factory.factories.PriceFactory;
import com.patterns.creational.factory.services.PriceService;

public class Main {

    public static void main(String[] args) {
        // La fábrica elige la clase. El cliente trabaja con la interfaz PriceService.
        PriceService euroPrice = PriceFactory.create("EUROPE");
        PriceService dollarPrice = PriceFactory.create("USA");

        System.out.println("Price in EUROPE: " + euroPrice.getPrice());
        System.out.println("Price in USA: " + dollarPrice.getPrice());
    }
}
