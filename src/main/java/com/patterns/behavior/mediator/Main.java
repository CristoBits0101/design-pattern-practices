package com.patterns.behavior.mediator;

import com.patterns.behavior.mediator.mediators.ConcreteMediatorExt;
import com.patterns.behavior.mediator.services.ConcreteFriendExt;

public class Main {
    public static void main(String[] args) {

        // Step 5.1: Instantiate mediator
        ConcreteMediatorExt concreteMediator = new ConcreteMediatorExt();

        // Step 5.2: Instantiate ConcreteFriend and adds friends
        ConcreteFriendExt concreteFriend1 = new ConcreteFriendExt("Alice");
        ConcreteFriendExt concreteFriend2 = new ConcreteFriendExt("Bob");
        ConcreteFriendExt concreteFriend3 = new ConcreteFriendExt("Charlie");

        // Step 5.2: Register friends to concrete mediator
        concreteMediator.registerFriend(concreteFriend1);
        concreteMediator.registerFriend(concreteFriend2);
        concreteMediator.registerFriend(concreteFriend3);

        // Step 5.3: Send a message from one friend
        concreteFriend1.sendMessage();

    }
}
