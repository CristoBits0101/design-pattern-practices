package com.patterns.structural.adapter;

interface Switchable {
    String turnOn();
}

final class LegacyLed {
    public String connect(int voltage) {
        return "LED encendido a " + voltage + " V";
    }
}

final class LedAdapter implements Switchable {
    private final LegacyLed led;

    public LedAdapter(LegacyLed led) {
        this.led = led;
    }

    @Override
    public String turnOn() {
        return led.connect(5);
    }
}

public class Main {

    public static void main(String[] args) {
        Switchable light = new LedAdapter(new LegacyLed());
        System.out.println(light.turnOn());
    }
}
