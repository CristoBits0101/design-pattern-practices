package com.patterns.structural.facade;

/*
 * Problema: iniciar una película requiere coordinar la televisión y el sonido.
 * Idea: una fachada reúne esas operaciones en watchMovie().
 * Observa: el cliente hace una llamada y la fachada utiliza los dos componentes.
 */
final class Television {
    public String turnOn() {
        return "Televisión encendida";
    }
}

final class SoundSystem {
    public String turnOn() {
        return "Sonido encendido";
    }
}

final class HomeTheater {
    private final Television television = new Television();
    private final SoundSystem sound = new SoundSystem();

    public String watchMovie() {
        return television.turnOn() + "\n" + sound.turnOn() + "\nPelícula iniciada";
    }
}

public class Main {

    public static void main(String[] args) {
        HomeTheater theater = new HomeTheater();
        System.out.println(theater.watchMovie());
    }
}
