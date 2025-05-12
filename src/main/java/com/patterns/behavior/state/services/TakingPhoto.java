package com.patterns.behavior.state.services;

import com.patterns.behavior.state.models.Phone;

// Step 5.1: Create a class that extends StateService
public class TakingPhoto extends StateService {

    /**
     * Constructors
     */

    // Step 5.2: Create a constructor that takes a Phone object
    public TakingPhoto(Phone phone) {
        super(phone);
    }

    /**
     * Methods
     */

    // Step 5.3: Implement the unlockPhone method
    @Override
    public void unlockPhone() {
        System.out.println("The phone is already unlocked.");
    }

    // Step 5.4: Implement the openCamera method
    @Override
    public void openCamera() {
        System.out.println("Camera is already open.");
    }

    // Step 5.5: Implement the takePhoto method
    @Override
    public void takePhoto() {
        System.out.println("Photo taken. Returning to unlocked state.");
        phone.setState(new UnlockedStatus(phone));
    }
}
