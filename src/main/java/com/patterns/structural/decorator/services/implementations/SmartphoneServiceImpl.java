package com.patterns.structural.decorator.services.implementations;

import com.patterns.structural.decorator.decorators.PhoneDecorator;
import com.patterns.structural.decorator.services.interfaces.PhoneService;

// Step 5.1: Create a class that implements the PhoneDecorator
public class SmartphoneServiceImpl extends PhoneDecorator {

    /**
     * Constructors
     */

    // Step 5.2: The class constructor invokes the parent constructor
    public SmartphoneServiceImpl(PhoneService phoneService) {
        super(phoneService);
    }

    /**
     * Methods
     */

    // Step 5.3: Override the create method to add new functionality
    @Override
    public void create() {
        super.create();
        itHaveCamera();
        itHaveGPS();
    }

    // Step 5.4: Add any additional methods or properties if needed
    private void itHaveCamera() {
        System.out.println("¡Tengo cámara!");
    }

    private void itHaveGPS() {
        System.out.println("¡Tengo GPS!");
    }

}
