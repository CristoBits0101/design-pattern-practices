package com.patrones.creacionales.singleton;

public class Main {
    public static void main(String[] args) {

        // Step 1: Create a Singleton instance
        Singleton singleton = new Singleton();

        // Step 2: Set the counter value
        singleton.setContador(5);

        // Step 3: Get the counter value
        System.out.println("Singleton Counter: " + singleton.getContador());

    }
}