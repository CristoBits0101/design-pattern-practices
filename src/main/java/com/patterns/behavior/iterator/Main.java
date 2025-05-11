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

    }
}
