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
        vehicle.setBrand(brand);
    }

    /**
     * Methods
     */

    // Step 2.4: Create a method that configures the vehicle doors
    public CarBuilder setDoors(int doors) {
        // This: It can be omitted if there is no equal name
        vehicle.setDoors(doors);
        // Returns an instance of the class itself
        // This is known as fluid programming
        return this;
    }

    // Step 2.5: 
    public Vehicle build() {
        return vehicle;
    }

}
