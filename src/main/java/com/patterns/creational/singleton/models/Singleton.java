package com.patterns.creational.singleton.models;

public final class Singleton {

    // La inicialización de la clase crea una sola instancia incluso con varios hilos.
    private static final Singleton INSTANCE = new Singleton();
    private int contador;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Compartir una instancia y proteger su estado son responsabilidades distintas.
    public synchronized int getContador() {
        return contador;
    }

    public synchronized void setContador(int contador) {
        this.contador = contador;
    }
}
