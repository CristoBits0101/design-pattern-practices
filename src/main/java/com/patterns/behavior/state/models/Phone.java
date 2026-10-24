package com.patterns.behavior.state.models;

import com.patterns.behavior.state.services.StateService;
import com.patterns.behavior.state.services.implementations.LockedStatusImpl;
import java.util.Objects;

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

    // El estado inicial recibe el teléfono al que pertenece. No necesita un null provisional.
    public Phone() {
        this.state = new LockedStatusImpl(this);
    }

    /**
     * Methods
     */

    // Cambia el objeto que decide cómo responde el teléfono.
    public void setState(StateService state) {
        this.state = Objects.requireNonNull(state, "State must not be null");
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
