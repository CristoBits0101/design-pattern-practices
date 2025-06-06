package com.patterns.behavior.state.services.implementations;

import com.patterns.behavior.state.models.Phone;
import com.patterns.behavior.state.services.StateService;

// Step 3.1: Create a class that extends StateService
public class LockedStatusImpl extends StateService {

    /**
     * Constructors
     */

    // Step 3.2: Create a constructor that takes a Phone object
    public LockedStatusImpl(Phone phone) {
        super(phone);
    }

    /**
     * Methods
     */

    // Step 3.3: Implement the unlockPhone method
    @Override
    public void unlockPhone() {
        System.out.println("Unlocking phone...");
        phone.setState(new UnlockedStatusImpl(phone));
    }

    // Step 3.4: Implement the openCamera method
    @Override
    public void openCamera() {
        System.out.println("You need to unlock the phone first.");
    }

    // Step 3.5: Implement the takePhoto method
    @Override
    public void takePhoto() {
        System.out.println("You need to unlock the phone first.");
    }

}
