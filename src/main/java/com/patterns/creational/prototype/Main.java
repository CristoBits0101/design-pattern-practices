package com.patterns.creational.prototype;

import com.patterns.creational.prototype.models.Car;

public class Main {

    public static void main(String[] args) {
        // Step 2.1: We create a new instance of the class
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.doors = 4;

        // Step 2.2: We create a new instance of the class
        Car clonedCar = car.clone();

        // Step 2.3: Modify the cloned instance
        clonedCar.brand = "Honda";
        clonedCar.model = "Civic";
        clonedCar.doors = 2;

        // Step 2.4: Print the original and cloned instances
        System.out.println("Original Car: " + car.brand + " " + car.model + " " + car.doors);
        System.out.println("Cloned Car: " + clonedCar.brand + " " + clonedCar.model + " " + clonedCar.doors);
    }

}
