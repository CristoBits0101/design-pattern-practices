package com.patterns.behavior.mediator.services;

import com.patterns.behavior.mediator.mediators.Mediator;

// Step 2.1: Create an abstract class for Friend
public abstract class Friend {

    /**
     * Attributes
     */

    // Step 2.2: Declare a reference to the mediator
    public Mediator mediator;

    /**
     * Methods
     */

    // Step 2.3: Create a method to set the mediator
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Step 2.4: Create an abstract method to send messages
    public abstract void sendMessage();

    // Step 2.5: Create an abstract method to receive messages
    public abstract void receiveMessage();
    
}
