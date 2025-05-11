package com.patterns.behavior.iterator.models;

// Step 1: Create a class to represent the elements in the collection
public class User {

    /**
     * Attributes
     */

    private String name;
    private int age;

    /**
     * Constructors
     */

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Getters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
