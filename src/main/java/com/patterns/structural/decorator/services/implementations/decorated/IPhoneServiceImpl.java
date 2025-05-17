package com.patterns.structural.decorator.services.implementations.decorated;

import com.patterns.structural.decorator.decorators.PhoneDecorator;
import com.patterns.structural.decorator.services.PhoneService;

// Step 4.1: Create a class that implements the PhoneDecorator
public class IPhoneServiceImpl extends PhoneDecorator {

    /**
     * Constructors
     */

    // Step 4.2: The class constructor invokes the parent constructor
    // Pass the basic phone object to the parent constructor
    public IPhoneServiceImpl(PhoneService phoneService) {
        super(phoneService);
    }

    /**
     * Methods
     */

    // Step 4.3: Implement the create method
    @Override
    public void showFunctionality() {

        // Step 4.4: Call the parent method to maintain the original functionality
        // This will call the showFunctionality method of the PhoneDecorator and call to basic showFunctionality
        super.showFunctionality();

        // Step 4.5: Add additional functionality specific to iPhone
        itHaveFaceID();
        itHaveSiri();

    }

    // Step 4.6: Add any additional methods or properties if needed
    private void itHaveFaceID() {
        System.out.println("¡Tengo Face ID!");
    }

    private void itHaveSiri() {
        System.out.println("¡Tengo Siri!");
    }

}
