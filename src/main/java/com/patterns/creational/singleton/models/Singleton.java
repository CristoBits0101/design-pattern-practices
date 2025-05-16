package com.patterns.creational.singleton.models;

public class Singleton {

    /**
     * Attributes
     */
    public int contador = 0;

    // Step 1: Create a Singleton instance
    private static Singleton singleton;

    /**
     * Constructors
     */

    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {
    }

    /**
     * Methods
     */

    // Step 3: Create a public static method to get the Singleton instance
    public static Singleton getInstance() {
        // Check if the instance is null and if so create a new instance
        // Always returns the singleton attribute that is the instance of the Singleton
        // class
        // Although the constructor is private, it can be accessed from the class
        // itself.
        return (singleton == null) ? (singleton = new Singleton()) : singleton;
    }

    /**
     * Getters and Setters
     */
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * Methods
     * 
     * Dont can change the singleton attribute
     * Dont have a setter method
     * Dont have a public constructor
     * Dont have parameters for change the singleton attribute
     */
    public boolean isRunning() {
        if (singleton == null)
            return false;
        return true;
    }

}
