package com.patterns.behavior.mediator.mediators;

import com.patterns.behavior.mediator.services.Friend;

// Step 1.1: Create an abstract class for Mediator
public abstract class Mediator {

    /**
     * Methods
     */

    // Step 1.2: Create an abstract method to register friends
    public abstract void registerMessage(Friend friend);

    // Step 1.3: Create an abstract method to resend messages
    public abstract void resendMessage(Friend friend);

}
