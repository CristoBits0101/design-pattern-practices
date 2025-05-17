package com.patterns.structural.adapter;

import com.patterns.structural.adapter.adapters.PowerAdapter;
import com.patterns.structural.adapter.services.PluggableService;
import com.patterns.structural.adapter.services.implementations.LampServiceImpl;
import com.patterns.structural.adapter.services.implementations.OvenServiceImpl;

public class Main {

    public static void main(String[] args) {

        // Step 4.1: Instantiate the classes
        OvenServiceImpl ovenService = new OvenServiceImpl();
        LampServiceImpl lampService = new LampServiceImpl();
        PowerAdapter powerAdapter = new PowerAdapter();

        // Step 4.3: Call the methods
        turnOn(ovenService);
        turnOn(lampService);
        turnOn(powerAdapter);

        System.out.println();

        turnOff(ovenService);
        turnOff(lampService);
        turnOff(powerAdapter);

    }

    // Step 4.2: The interface methods get the object references and call them.
    public static void turnOn(PluggableService pluggableService) {
        pluggableService.turnOn();
    }

    public static void turnOff(PluggableService pluggableService) {
        pluggableService.turnOff();
    }

    public static boolean isOn(PluggableService pluggableService) {
        return pluggableService.isOn();
    }

}
