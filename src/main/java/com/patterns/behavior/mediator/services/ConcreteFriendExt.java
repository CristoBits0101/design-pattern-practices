package com.patterns.behavior.mediator.services;

// Step 4.1: Create a concrete class for Friend
public class ConcreteFriendExt extends Friend {

    /**
     * Attributes
     */

    private String name;

    /**
     * Constructors
     */

    public ConcreteFriendExt(String name) {
        this.name = name;
    }

    /**
     * Methods
     */

    // Step 4.2: Create a method to send messages
    @Override
    public void sendMessage() {
        System.out.println("I'm " + name + " and sent a message!");
        mediator.resendMessage(this);
    }

    // Step 4.3: Create a method to receive messages
    @Override
    public void receiveMessage() {
        // Object that receives the message
        System.out.println(name + " received a message!");
    }

}
