package com.patterns.behavior.state.models;

import com.patterns.behavior.state.services.StateService;

// Step 2.1: Create the Phone class
public class Phone {

    /**
     * Attributes
     */

    // Step 2.2: Store the current state of the phone
    private StateService state;

    /**
     * Constructors
     */

    // Step 2.3: Create a constructor that receives a state
    public Phone(StateService state) {
        this.state = state;
    }

    /**
     * Methods
     */

    // Step 2.4: Create a method to set the state
    public void setState(StateService state) {
        this.state = state;
    }

    // Step 2.5: Create methods to delegate behavior
    public void unlockPhone() {
        state.unlockPhone();
    }

    public void openCamera() {
        state.openCamera();
    }

    public void takePhoto() {
        state.takePhoto();
    }
    
}
