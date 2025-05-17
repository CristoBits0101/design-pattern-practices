package com.patterns.behavior.state.services.implementations;

import com.patterns.behavior.state.models.Phone;
import com.patterns.behavior.state.services.StateService;

public class UnlockedStatusImpl extends StateService {

    /**
     * Constructors
     */

    // Step 3.2: Create a constructor that takes a Phone object
    public UnlockedStatusImpl(Phone phone) {
        super(phone);
    }

    /**
     * Methods
     */

    // Step 3.2: Implement the unlockPhone method
    @Override
    public void unlockPhone() {
        System.out.println("The phone is already unlocked.");
    }

    // Step 3.3: Implement the openCamera method
    // Pass the new state to the phone
    @Override
    public void openCamera() {
        System.out.println("Opening camera...");
        phone.setState(new OpenCameraImpl(phone));
    }

    // Step 3.4: Implement the takePhoto method
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
        phone.setState(new TakingPhotoImpl(phone));
    }

}
