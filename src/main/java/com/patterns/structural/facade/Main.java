package com.patterns.structural.facade;

import com.patterns.structural.facade.facades.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {

        // Step 4.1: Instantiate the HomeTheaterFacade class
        HomeTheaterFacade theater = new HomeTheaterFacade();

        // Step 4.2: Call the watchMovie and endMovie methods
        theater.watchMovie();
        theater.endMovie();

    }
}
