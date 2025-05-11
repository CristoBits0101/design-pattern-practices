package com.patterns.structural.adapter.services;

// Step 2.1: Create a class called LampServiceImpl that implements the PluggableService interface
public class LampServiceImpl implements PluggableService {

    /**
     * Attributes
     */
    private boolean isOn = false;

    /**
     * Methods
     */

    // Step 2.3: Implement the methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned on!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is turned off!");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

}
