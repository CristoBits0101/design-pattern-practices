package com.patterns.behavior.mediator;

import com.patterns.behavior.mediator.mediators.ConcreteMediator;
import com.patterns.behavior.mediator.services.ConcreteFriend;

public class Main {
    public static void main(String[] args) {

        // Step 5.1: Instantiate mediator and friends
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteFriend friend1 = new ConcreteFriend("Alice");
        ConcreteFriend friend2 = new ConcreteFriend("Bob");
        ConcreteFriend friend3 = new ConcreteFriend("Charlie");

        // Step 5.2: Register friends to mediator
        mediator.registerMessage(friend1);
        mediator.registerMessage(friend2);
        mediator.registerMessage(friend3);

        // Step 5.3: Send a message from one friend
        friend1.sendMessage();
        
    }
}
