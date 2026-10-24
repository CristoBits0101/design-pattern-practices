package com.patterns.behavior.state;

interface PhoneState {
    String pressButton(Phone phone);
}

final class Phone {
    private PhoneState state = new Locked();

    public String pressButton() {
        return state.pressButton(this);
    }

    void setState(PhoneState state) {
        this.state = state;
    }
}

final class Locked implements PhoneState {
    @Override
    public String pressButton(Phone phone) {
        phone.setState(new Unlocked());
        return "Teléfono desbloqueado.";
    }
}

final class Unlocked implements PhoneState {
    @Override
    public String pressButton(Phone phone) {
        phone.setState(new Locked());
        return "Teléfono bloqueado.";
    }
}

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.pressButton());
        System.out.println(phone.pressButton());
        System.out.println(phone.pressButton());
    }
}
