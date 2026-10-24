package com.patterns.behavior.state;

import com.patterns.behavior.state.models.Phone;

// Step 6.1: Create a main class to test the State pattern
public class Main {

    public static void main(String[] args) {

        // El teléfono crea su estado inicial con una referencia válida a sí mismo.
        Phone phone = new Phone();

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
