package com.patterns.structural.facade.facades;

import com.patterns.structural.facade.services.SoundSystem;
import com.patterns.structural.facade.services.TV;

// Step 2.1: Create the HomeTheaterFacade class Facade
public class HomeTheaterFacade {

    /**
     * Attributes
     */

    // Step 2.2: Create the TV and SoundSystem attributes
    private TV tv;
    private SoundSystem sound;

    /**
     * Constructors
     */

    // Step 2.3: Create the constructor for initializing the TV and SoundSystem
    public HomeTheaterFacade() {
        this.tv = new TV();
        this.sound = new SoundSystem();
    }

    /**
     * Methods
     */

    // Step 2.4: Create the watchMovie and endMovie methods
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
