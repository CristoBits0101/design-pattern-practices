package com.patterns.creational.builder;

import com.patterns.creational.builder.models.Vehicle;
import com.patterns.creational.builder.builders.CarBuilder;

public class Main {

    public static void main(String[] args) {

        // Step 3.1: Create a new CarBuilder object
        Vehicle car = new CarBuilder("Toyota")
                .setDoors(4)
                .build();

        // Step 3.2: Print the car details
        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car doors: " + car.getDoors());

    }

}
