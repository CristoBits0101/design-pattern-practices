package com.patterns.behavior.observer.receivers.implementations;

import com.patterns.behavior.observer.receivers.Receptor;

// Step 3.1: Create an receiver class that implements the Receptor interface
public class SatelliteReceiverImpl implements Receptor {

    // Step 3.2: Implement the receive method and take action accordingly
    @Override
    public void receive(String message) {
        System.out.println("Satellite Receiver received message: " + message);
    }

}
