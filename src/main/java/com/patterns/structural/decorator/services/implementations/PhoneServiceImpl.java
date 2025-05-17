package com.patterns.structural.decorator.services.implementations;

import com.patterns.structural.decorator.services.PhoneService;

// Let's imitate an old phone code!!

// Step 2.1: Create a class that implements the PhoneService interface
public class PhoneServiceImpl implements PhoneService {

    // Step 2.2: Implement the interface
    @Override
    public void create() {

        System.out.println("Creating a basic phone service");

        // Step 2.4: Call the methods to demonstrate functionality
        itHaveGSM();
        itHaveSMS();

    }

    // Step 2.3: Add any additional methods or properties if needed
    private void itHaveGSM() {
        System.out.println("¡Tengo GSM!");
    }

    private void itHaveSMS() {
        System.out.println("¡Tengo SMS!");
    }

}
