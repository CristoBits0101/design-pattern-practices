package com.patterns.creational.singleton.models;

public class Singleton {

    /**
     * Attributes
     */
    public int contador = 0;

    // Step 1: Create a Singleton instance
    private Singleton singleton;

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
        return new Singleton();
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

}
