package com.patterns.behavior.state.services;

import com.patterns.behavior.state.models.Phone;

public class UnlockedStatus extends StateService {

    /**
     * Constructors
     */

    // Step 3.2: Create a constructor that takes a Phone object
    public UnlockedStatus(Phone phone) {
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
    @Override
    public void openCamera() {
        System.out.println("Opening camera...");
        phone.setState(new OpenCamera(phone));
    }

    // Step 3.4: Implement the takePhoto method
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
        phone.setState(new TakingPhoto(phone));
    }

}
