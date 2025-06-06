package com.patterns.behavior.state.services;

import com.patterns.behavior.state.models.Phone;

/**
 * The phone model get state from the StateService class.
 * This class is the abstract class that defines the state of the phone.
 * It contains the methods that will be implemented by the concrete states.
 */

// Step 1.1: Create a State for the phone
public abstract class StateService {

    /**
     * Attributes
     */

    // Step 1.2: Create a reference to the Phone object to work
    public Phone phone;

    /**
     * Constructors
     */

    // Step 1.3: Create a constructor that takes a Phone object
    public StateService(Phone phone) {
        this.phone = phone;
    }

    /**
     * Methods
     */

    // Step 1.4: Create dependent methods
    public abstract void unlockPhone();

    public abstract void openCamera();

    public abstract void takePhoto();

}
