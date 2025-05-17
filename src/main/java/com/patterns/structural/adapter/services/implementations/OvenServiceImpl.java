package com.patterns.structural.adapter.services.implementations;

import com.patterns.structural.adapter.services.PluggableService;

// Step 2.1: Create a class called OvenServiceImpl that implements the PluggableService interface
public class OvenServiceImpl implements PluggableService {

    /**
     * Attributes
     */

    // Step 2.2: Create an attribute called isOn of type boolean
    boolean isOn = false;

    /**
     * Methods
     */

    // Step 2.3: Implement the methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Oven is turned on!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Oven is turned off!");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

}
