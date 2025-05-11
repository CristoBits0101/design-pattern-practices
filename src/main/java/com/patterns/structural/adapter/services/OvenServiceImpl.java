package com.patterns.structural.adapter.services;

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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public boolean isOn() {
        return isOn;
    }

}
