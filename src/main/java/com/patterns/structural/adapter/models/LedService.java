package com.patterns.structural.adapter.models;

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
    public void connected(int voltaje) {
        poweredOn = true;
        this.voltaje = voltaje;
        System.out.println("Led is turned on with " + voltaje + " volts!");
    }

    public void disconnect() {
        poweredOn = false;
        voltaje = 0;
        System.out.println("Led is turned off!");
    }

    public boolean isConnected() {
        return poweredOn;
    }

}
