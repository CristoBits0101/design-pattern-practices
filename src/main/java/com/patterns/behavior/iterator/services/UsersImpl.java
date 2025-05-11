package com.patterns.behavior.iterator.services;

import java.util.ArrayList;

import com.patterns.behavior.iterator.iterators.UserIterator;
import com.patterns.behavior.iterator.models.User;

// Step 3.1: Create a class to implement the interface iterator
public class UsersImpl implements UserIterator {

    /**
     * Attributes
     */

    // Step 3.2: Create a collection to store the users
    // The type of the collection is indifferent
    private ArrayList<User> users = new ArrayList<User>();

    // Step 3.3: Create a variable to store the current position in the collection
    private int position = 0;

    /**
     * Methods
     */

    // Step 3.4: Receive a user and add it to the collection
    public void create(User user) {
        users.add(user);
    }

    @Override
    public User next() {
        // Step 3.5: Get the user at the current position in the collection
        User user = users.get(position);
        // Step 3.6: Increment the position to point to the next user
        position++;
        // Step 3.7: Return the user at the current position
        return user;
    }

    @Override
    public boolean hasMore() {
        // Step 3.8: Check if there are more users in the collection
        return position < users.size();
    }

    @Override
    public void reset() {
        // Step 3.9: Reset the position to the beginning of the collection
        position = 0;
    }

}
