package com.patterns.creational.builder;

import com.patterns.creational.builder.models.Vehicle;
import com.patterns.creational.builder.builders.CarBuilder;

public class Main {
    
    public static void main(String[] args) {

        // Step 3.1: Create a new CarBuilder object
        Vehicle carBuilder = new CarBuilder("Toyota");
        
    }

}
