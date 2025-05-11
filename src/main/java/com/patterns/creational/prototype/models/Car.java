package com.patterns.creational.prototype.models;

// Step 1.1: Create a class that implements the Prototype without interface
public class Car {

    /**
     * Attributes
     */

    public String brand;
    public String model;
    public int doors;

    /**
     * Constructors
     */

    public Car() {
    }

    // Step 1.2: Creates an instance of the class itself
    public Car clone() {
        Car clon = new Car();

        // Step 1.3: Copy the attributes of the original instance to the new instance
        clon.brand = this.brand;
        clon.model = this.model;
        clon.doors = this.doors;

        // Step 1.4: Return the new instance
        return clon;
    }

}
