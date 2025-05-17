package com.patterns.structural.decorator.decorators.implementations;

import com.patterns.structural.decorator.decorators.PhoneDecorator;
import com.patterns.structural.decorator.services.PhoneService;

// Step 5.1: Create a class that implements the PhoneDecorator
public class IPhoneServiceImpl extends PhoneDecorator {

    /**
     * Constructors
     */

    // Step 5.2: The class constructor invokes the parent constructor
    public IPhoneServiceImpl(PhoneService phoneService) {
        super(phoneService);
    }

    /**
     * Methods
     */

    // Step 5.3: Implement the create method
    @Override
    public void create() {

        // Step 5.4: Call the parent method to maintain the original functionality
        super.create();

        // Step 5.5: Add additional functionality specific to iPhone
        itHaveFaceID();
        itHaveSiri();

    }

    // Step 5.6: Add any additional methods or properties if needed
    private void itHaveFaceID() {
        System.out.println("¡Tengo Face ID!");
    }

    private void itHaveSiri() {
        System.out.println("¡Tengo Siri!");
    }

}
