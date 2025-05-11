package com.patterns.creational.builder.models;

// Step 1: Create a class named vehicle
public class Vehicle {

    /**
     * Atributes
     */

    public String brand;
    public String type;
    public String engine;
    public int doors;

    /**
     * Getters and Setters
     */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
