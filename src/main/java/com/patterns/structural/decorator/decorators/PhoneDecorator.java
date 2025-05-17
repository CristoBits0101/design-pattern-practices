package com.patterns.structural.decorator.decorators;

import com.patterns.structural.decorator.services.PhoneService;

// Step 4.1: Create a class decorator that implements the PhoneService interface
public class PhoneDecorator implements PhoneService {

    /**
     * Attributes
     */

    // Step 4.2: Create a PhoneService object
    private PhoneService phoneService;

    /**
     * Constructors
     */

    // Step 4.3: Create a constructor that takes the interface as a parameter
    protected PhoneDecorator(PhoneService phoneService) {
        // Step 4.4: Modify the interface to use the PhoneService object
        this.phoneService = phoneService;
    }

    /**
     * Methods
     */

    // Step 4.5: Create a PhoneService object
    @Override
    public void create() {
        this.phoneService.create();
    }

}
