package com.patterns.structural.adapter.services.implementations;

import com.patterns.structural.adapter.services.PluggableService;

// Step 2.1: Create a class called LampServiceImpl that implements the PluggableService interface
public class LampServiceImpl implements PluggableService {

    /**
     * Attributes
     */
    
    // Step 2.2: Create an attribute called isOn
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
