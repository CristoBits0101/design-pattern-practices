package com.patterns.creational.prototype;

import com.patterns.creational.prototype.models.Car;
import com.patterns.creational.prototype.models.Motorbike;

public class Main {

    public static void main(String[] args) {

        /**
         * Step 2: Clone without interface
         * 
         * No interface returns only the specified attributes
         */

        // Step 2.1: We create a new instance of the class
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.doors = 4;

        // Step 2.2: We create a clone of the class
        Car clonedCar = car.clone();

        // Step 2.3: Modify the cloned instance
        clonedCar.brand = "Honda";
        clonedCar.model = "Civic";
        clonedCar.doors = 2;

        // Step 2.4: Print the original and cloned instances
        System.out.println("Original Car: " + car.brand + " " + car.model + " " + car.doors);
        System.out.println("Cloned Car: " + clonedCar.brand + " " + clonedCar.model + " " + clonedCar.doors);

        /**
         * Step 3: Clone with interface
         * 
         * With interface returns all the attributes
         */

        // Step 3.1: We create a new instance of the class
        Motorbike motorbike = new Motorbike();
        motorbike.brand = "Yamaha";
        motorbike.model = "R1";
        motorbike.doors = 0;

        // Step 3.2: Print the original instance
        System.out.println("Original Motorbike: " + motorbike.brand + " " + motorbike.model + " " + motorbike.doors);

        // Step 3.3: We create a clone of the class
        try {
            Motorbike clonedMotorbike = motorbike.clone();

            // Step 3.4: Modify the cloned instance
            clonedMotorbike.brand = "Kawasaki";
            clonedMotorbike.model = "Ninja";
            clonedMotorbike.doors = 0;

            // Step 3.5: Print the original and cloned instances
            System.out.println("cloned Motorbike: " + clonedMotorbike.brand + " " + clonedMotorbike.model + " "
                    + clonedMotorbike.doors);

        } catch (CloneNotSupportedException e) {
            System.out.println("Dont can clone cause: " + e.getMessage());
        }

    }

}
