package com.patterns.creational.prototype.models;

// Step 1.1: Create a class that implements the Prototype with interface
public class Motorbike implements Cloneable {

    /**
     * Attributes
     */

    public String brand;
    public String model;
    public int doors;

    /**
     * Constructors
     */

    public Motorbike() {
    }

    // Step 1.2: Creates an instance of the class itself
    @Override
    public Motorbike clone() throws CloneNotSupportedException {
        return (Motorbike) super.clone();
    }

}
