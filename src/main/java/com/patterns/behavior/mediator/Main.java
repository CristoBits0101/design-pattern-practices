package com.patterns.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

final class ChatRoom {
    private final List<User> users = new ArrayList<>();

    void register(User user) {
        users.add(user);
    }

    public void send(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                user.receive(sender.getName() + ": " + message);
            }
        }
    }
}

final class User {
    private final String name;
    private final ChatRoom room;
    private final List<String> messages = new ArrayList<>();

    public User(String name, ChatRoom room) {
        this.name = name;
        this.room = room;
        room.register(this);
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        room.send(this, message);
    }

    void receive(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return List.copyOf(messages);
    }
}

public class Main {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User ana = new User("Ana", room);
        User luis = new User("Luis", room);
        User eva = new User("Eva", room);

        ana.send("Hola");
        System.out.println("Ana recibe: " + ana.getMessages());
        System.out.println("Luis recibe: " + luis.getMessages());
        System.out.println("Eva recibe: " + eva.getMessages());
    }
}
