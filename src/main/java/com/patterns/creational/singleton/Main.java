package com.patterns.creational.singleton;

// Problema: proporcionar acceso a una única instancia de una clase.
// Idea: la clase crea su instancia y evita que el cliente invoque new.
// Observa: dos llamadas a getInstance() devuelven el mismo objeto.
public class Main {
    public static void main(String[] args) {
        Settings first = Settings.getInstance();
        Settings second = Settings.getInstance();
        System.out.println("Misma instancia: " + (first == second));
    }
}

final class Settings {
    // La inicialización de la clase es segura entre hilos.
    private static final Settings INSTANCE = new Settings();

    private Settings() {
    }

    public static Settings getInstance() {
        return INSTANCE;
    }
}
