package com.patterns.behavior.observer.receivers;

// Step 3.1: Create an receiver class that implements the Receptor interface
public class TVReceiverImpl implements Receptor {

    // Step 3.3: Implement the receive method and take action accordingly
    @Override
    public void receive(String message) {
        System.out.println("TV Receiver received message: " + message);
    }

}
