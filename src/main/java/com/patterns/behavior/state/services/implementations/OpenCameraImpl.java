package com.patterns.behavior.state.services.implementations;

import com.patterns.behavior.state.models.Phone;
import com.patterns.behavior.state.services.StateService;

// Step 4.1: Create a class that extends StateService
public class OpenCameraImpl extends StateService {

    /**
     * Constructors
     */

    // Step 4.2: Create a constructor that takes a Phone object
    public OpenCameraImpl(Phone phone) {
        super(phone);
    }

    /**
     * Methods
     */

    // Step 4.3: Implement the unlockPhone method
    @Override
    public void unlockPhone() {
        System.out.println("The phone is already unlocked.");
    }

    // Step 4.4: Implement the openCamera method
    @Override
    public void openCamera() {
        System.out.println("Camera is already open.");
    }

    // Step 4.5: Implement the takePhoto method
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
        phone.setState(new TakingPhotoImpl(phone));
    }
    
}
