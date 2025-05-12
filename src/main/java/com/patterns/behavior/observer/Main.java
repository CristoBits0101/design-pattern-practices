package com.patterns.behavior.observer;

import com.patterns.behavior.observer.emitters.Station;
import com.patterns.behavior.observer.receivers.SatelliteReceiverImpl;
import com.patterns.behavior.observer.receivers.TVReceiverImpl;

public class Main {
    public static void main(String[] args) {

        // Step 4.1: Import the emitter class
        Station station = new Station();

        // Step 4.2: Create instances of the receiver classes
        TVReceiverImpl tvReceiver = new TVReceiverImpl();
        SatelliteReceiverImpl satelliteReceiver = new SatelliteReceiverImpl();

        // Step 4.3: Register the receivers with the emitter
        station.addReceptor(tvReceiver);
        station.addReceptor(satelliteReceiver);

        // Step 4.4: Emit a message
        station.sendMessage("Hello, World!");

    }
}
