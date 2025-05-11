package com.patterns.structural.adapter.services;

// Step 2.1: Create a class called LedService
public class LedService {

    /**
     * Attributes
     */

    // Step 2.2: Create attributes called poweredOn and voltage
    boolean poweredOn = false;
    int voltaje = 0;

    /**
     * Methods
     */

    // Step 2.3: Implement the methods
    public void turnOn(int voltaje) {
        poweredOn = true;
        this.voltaje = voltaje;
        System.out.println("Led is turned on with " + voltaje + " volts!");
    }

    public void turnOff() {
        poweredOn = false;
        voltaje = 0;
        System.out.println("Led is turned off!");
    }

    public boolean isOn() {
        return poweredOn;
    }

}
