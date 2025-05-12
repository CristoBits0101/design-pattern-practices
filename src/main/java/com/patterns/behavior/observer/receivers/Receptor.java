package com.patterns.behavior.observer.receivers;

// Step 1.1: Create an interface for the observer of messages
public interface Receptor {

    // Step 1.2: Define a method to receive messages
    void receive(String message);

}
