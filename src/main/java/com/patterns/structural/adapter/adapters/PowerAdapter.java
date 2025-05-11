package com.patterns.structural.adapter.adapters;

import com.patterns.structural.adapter.services.PluggableService;

// Step 3.1: Create a class called PowerAdapter that implements the PluggableService interface
public class PowerAdapter implements PluggableService {

    @Override
    public void turnOn() {
        throw new UnsupportedOperationException("Unimplemented method 'turnOn'");
    }

    @Override
    public void turnOff() {
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

    @Override
    public boolean isOn() {
        throw new UnsupportedOperationException("Unimplemented method 'isOn'");
    }

}
