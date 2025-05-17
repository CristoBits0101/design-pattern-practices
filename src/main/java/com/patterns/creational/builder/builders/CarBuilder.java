package com.patterns.creational.builder.builders;

import com.patterns.creational.builder.models.Vehicle;

// Step 2.1: Create a builder class for the vehicle type
public class CarBuilder {

    /**
     * Attributes
     */

    // Step 2.2: Create a attribute of type Vehicle
    Vehicle vehicle;

    /**
     * Constructors
     */

    // Step 2.3: Create a constructor that initializes the required attribute
    public CarBuilder(String brand) {
        vehicle = new Vehicle();
        vehicle.brand = brand;
    }

    /**
     * Methods: Can be added infinitely
     */

    // Step 2.4: Create a method that configures the vehicle doors
    public CarBuilder setDoors(int doors) {
        // This: It can be omitted if there is no equal name
        // Call the vehicle attribute for initialization
        vehicle.doors = doors;
        // Each time the instance itself is returned, it allows you to initialize one more attribute
        // Create a new instance with the same reference -> new CarBuilder(brand) -> new CarBuilder(this)
        // This is known as fluid programming
        return this;
    }

    // Step 2.5: Return the vehicle object
    public Vehicle build() {
        return vehicle;
    }

}
