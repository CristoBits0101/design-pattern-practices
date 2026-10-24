package com.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Settings first = Settings.getInstance();
        Settings second = Settings.getInstance();
        System.out.println("Misma instancia: " + (first == second));
    }
}

final class Settings {

    private static final Settings INSTANCE = new Settings();

    private Settings() {
    }

    public static Settings getInstance() {
        return INSTANCE;
    }
}
