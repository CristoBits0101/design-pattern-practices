package com.patterns.structural.decorator.services.implementations.decorated;

import com.patterns.structural.decorator.decorators.PhoneDecorator;
import com.patterns.structural.decorator.services.PhoneService;

// Step 4.1: Create a class that implements the PhoneDecorator
public class SmartphoneServiceImpl extends PhoneDecorator {

    /**
     * Constructors
     */

    // Step 4.2: The class constructor invokes the parent constructor
    public SmartphoneServiceImpl(PhoneService phoneService) {
        super(phoneService);
    }

    /**
     * Methods
     */

    // Step 4.3: Override the create method to add new functionality
    @Override
    public void showFunctionality() {
        super.showFunctionality();
        itHaveCamera();
        itHaveGPS();
    }

    // Step 4.4: Add any additional methods or properties if needed
    private void itHaveCamera() {
        System.out.println("¡Tengo cámara!");
    }

    private void itHaveGPS() {
        System.out.println("¡Tengo GPS!");
    }

}
