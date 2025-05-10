package com.patterns.creational.singleton;

import com.patterns.creational.singleton.models.Singleton;

public class Main {
    public static void main(String[] args) {

        /**
         * Singleton instance 1
         */

        // Step 1.1: Create a Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Step 1.2: Set the counter value
        singleton.setContador(5);

        // Step 1.3: Get the counter value
        System.out.println("Singleton Counter: " + singleton.getContador());

        // Step 1.4: Display Singleton instance information
        System.out.println("Singleton Instance: " + singleton);

        /**
         * Singleton instance 2
         */

        // Step 2.1: Create another Singleton instance
        Singleton singleton2 = Singleton.getInstance();

        // Step 2.2: Get the counter value
        System.out.println("Singleton2 Counter: " + singleton2.getContador());

        // Step 2.3: Display Singleton2 instance information
        System.out.println("Singleton2 Instance: " + singleton2);

    }
}