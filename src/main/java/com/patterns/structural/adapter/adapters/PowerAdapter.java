package com.patterns.structural.adapter.adapters;

import com.patterns.structural.adapter.services.LedService;
import com.patterns.structural.adapter.services.PluggableService;

// Step 3.1: Create a class called PowerAdapter that implements the PluggableService interface
public class PowerAdapter implements PluggableService {

    /**
     * Attribute
     */

    // Step 3.2: Instantiate the class to be adapted
    private final LedService ledService = new LedService();

    /**
     * Methods
     */

    // Step 3.3: Implement the methods
    @Override
    public void turnOn() {
        ledService.connected(220);
        System.out.println("PowerAdapter: Led is turned on with 220 volts!");
    }

    @Override
    public void turnOff() {
        ledService.disconnect();
        System.out.println("PowerAdapter: Led is turned off!");
    }

    @Override
    public boolean isOn() {
        return ledService.isConnected();
    }

}
