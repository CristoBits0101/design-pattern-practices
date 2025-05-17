package com.patterns.behavior.state;

import com.patterns.behavior.state.models.Phone;
import com.patterns.behavior.state.services.implementations.LockedStatusImpl;

// Step 6.1: Create a main class to test the State pattern
public class Main {

    public static void main(String[] args) {

        // Step 6.2: Create the phone starting in locked state
        Phone phone = new Phone(new LockedStatusImpl(null));
        // Pass phone reference after init
        phone.setState(new LockedStatusImpl(phone));

        // Step 6.3: Try to use the phone in various states
        System.out.println("=== Trying to open camera while locked ===");
        phone.openCamera();

        System.out.println("\n=== Unlocking the phone ===");
        phone.unlockPhone();

        System.out.println("\n=== Opening the camera ===");
        phone.openCamera();

        System.out.println("\n=== Taking a photo ===");
        phone.takePhoto();

        System.out.println("\n=== Taking another photo ===");
        // This should return to UnlockedStatus
        phone.takePhoto();

    }
}
