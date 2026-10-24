package com.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder("Toyota").withColor("rojo");
        Car first = builder.withDoors(4).build();
        Car second = builder.withDoors(2).build();
        System.out.println("Primero: " + first.getBrand() + " / " + first.getDoors() + " puertas / " + first.getColor());
        System.out.println("Segundo: " + second.getBrand() + " / " + second.getDoors() + " puertas / " + second.getColor());
    }
}

final class Car {
    private final String brand;
    private final int doors;
    private final String color;

    Car(String brand, int doors, String color) {
        this.brand = brand;
        this.doors = doors;
        this.color = color;
    }

    public String getBrand() { return brand; }
    public int getDoors() { return doors; }
    public String getColor() { return color; }
}

final class CarBuilder {
    private final String brand;
    private int doors = 4;
    private String color = "blanco";

    public CarBuilder(String brand) {
        this.brand = brand;
    }

    public CarBuilder withDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(brand, doors, color);
    }
}
