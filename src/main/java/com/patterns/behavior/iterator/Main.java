package com.patterns.behavior.iterator;

import com.patterns.behavior.iterator.models.User;
import com.patterns.behavior.iterator.services.UsersImpl;

public class Main {
    public static void main(String[] args) {

        // Step 4.1: Import the services
        UsersImpl user = new UsersImpl();

        // Step 4.2: Create new users
        user.create(new User("John Doe1", 18));
        user.create(new User("John Doe2", 18));
        user.create(new User("John Doe3", 18));

        // Step 4.3: Iterate over the users
        while (user.hasMore()) {
            // Step 4.4: Get the next user
            User u = user.next();
            // Step 4.5: Print the user
            System.out.println(u);
        }

        // Step 4.6: Reset the iterator
        user.reset();

    }
}
