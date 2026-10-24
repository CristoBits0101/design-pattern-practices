package com.patterns.creational.builder.builders;

import com.patterns.creational.builder.models.Vehicle;

public class CarBuilder {

    private final String brand;
    private int doors;

    public CarBuilder(String brand) {
        this.brand = brand;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        // Devuelve el mismo builder para encadenar pasos. No crea otra instancia.
        return this;
    }

    public Vehicle build() {
        // Cada construcción produce un vehículo independiente de los siguientes pasos.
        Vehicle vehicle = new Vehicle();
        vehicle.brand = brand;
        vehicle.doors = doors;
        return vehicle;
    }
}
