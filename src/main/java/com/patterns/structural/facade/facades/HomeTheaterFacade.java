package com.patterns.structural.facade.facades;

import com.patterns.structural.facade.services.SoundSystemService;
import com.patterns.structural.facade.services.TVService;

// Step 3.1: Create the HomeTheaterFacade class Facade
public class HomeTheaterFacade {

    /**
     * Attributes
     */

    // Step 3.2: Create the TV and SoundSystem attributes
    private TVService tv;
    private SoundSystemService sound;

    /**
     * Constructors
     */

    // Step 3.3: Create the constructor for initializing the TV and SoundSystem
    public HomeTheaterFacade() {
        this.tv = new TVService();
        this.sound = new SoundSystemService();
    }

    /**
     * Methods
     */

    // Step 3.4: Create the watchMovie and endMovie methods
    public void watchMovie() {
        tv.turnOn();
        sound.turnOn();
        System.out.println("Movie started");
    }

    public void endMovie() {
        tv.turnOff();
        sound.turnOff();
        System.out.println("Movie ended");
    }

}
