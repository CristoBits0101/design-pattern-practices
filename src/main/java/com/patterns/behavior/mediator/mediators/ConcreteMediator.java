package com.patterns.behavior.mediator.mediators;

import java.util.ArrayList;
import com.patterns.behavior.mediator.services.Friend;

// Step 3.1: Create a concrete class for Mediator
public class ConcreteMediator extends Mediator {

    /**
     * Attributes
     */

    // Step 3.2: Create a list to hold the friends
    private ArrayList<Friend> friends = new ArrayList<>();

    /**
     * Methods
     */

    // Step 3.3: Create a method to register friends
    @Override
    public void registerMessage(Friend friend) {
        if (!friends.contains(friend)) {
            // Add the friend to the list
            friends.add(friend);
            // Set the mediator for each friend
            // This reference to current instance of ConcreteMediator
            friend.setMediator(this);
        }
    }

    // Step 3.4: Create a method to resend messages
    @Override
    public void resendMessage(Friend friend) {
        // Loop through the list of friends
        for (Friend f : friends) {
            // Prevent the one who speaks from receiving too
            if (!f.equals(friend)) {
                // Send the message to the friend
                f.receiveMessage();
            }
        }
    }
}
