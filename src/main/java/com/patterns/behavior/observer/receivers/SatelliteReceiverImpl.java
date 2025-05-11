package com.patterns.behavior.observer.receivers;

public class SatelliteReceiverImpl implements Receptor {

    // Step 1.3: Implement the receive method
    @Override
    public void receive(String message) {
        System.out.println("Satellite Receiver received message: " + message);
    }

    // Step 1.4: Create a method to simulate receiving a message
    public void simulateReceivingMessage(String message) {
        receive(message);
    }

}
