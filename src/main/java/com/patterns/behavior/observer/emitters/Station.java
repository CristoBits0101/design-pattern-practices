package com.patterns.behavior.observer.emitters;

import java.util.ArrayList;
import java.util.List;

import com.patterns.behavior.observer.receivers.Receptor;

// Step 2.1: Create a message sender class
public class Station {

    // Step 2.2: Create a list of receiving observers.
    private List<Receptor> receptors = new ArrayList<>();

    // Step 2.3: Create a method to add observers
    public void addReceptor(Receptor receptor) {
        receptors.add(receptor);
    }

    // Step 2.4: Create a method to remove observers
    public void removeReceptor(Receptor receptor) {
        receptors.remove(receptor);
    }

    // Step 2.5: Create a method to send messages to all observers
    public void sendMessage(String message) {
        for (Receptor receptor : receptors) {
            receptor.receive(message);
        }
    }
    
}
