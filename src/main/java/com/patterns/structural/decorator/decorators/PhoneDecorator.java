package com.patterns.structural.decorator.decorators;

import com.patterns.structural.decorator.services.PhoneService;

// Step 3.1: Create a class decorator that implements the PhoneService interface
public class PhoneDecorator implements PhoneService {

    /**
     * Attributes
     */

    // Step 3.2: Create a PhoneService object
    private PhoneService phoneService;

    /**
     * Constructors
     */

    // Step 3.3: Create a constructor that takes the interface as a parameter
    protected PhoneDecorator(PhoneService phoneService) {
        // Step 3.4: Modify the interface to use the PhoneService object
        this.phoneService = phoneService;
    }

    /**
     * Methods
     */

    // Step 3.5: Implements interface and call the method of the PhoneService object
    @Override
    public void showFunctionality() {
        this.phoneService.showFunctionality();
    }

}
