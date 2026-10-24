package com.patterns.structural.decorator;

/*
 * Problema: combinar extras sin crear una clase de café para cada combinación.
 * Idea: cada decorador envuelve un Coffee y añade su parte al resultado.
 * Observa: leche y azúcar se acumulan sin cambiar el café original.
 */
interface Coffee {
    String description();
    int priceInCents();
}

final class PlainCoffee implements Coffee {
    @Override
    public String description() {
        return "Café";
    }

    @Override
    public int priceInCents() {
        return 200;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

final class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description() + " + leche";
    }

    @Override
    public int priceInCents() {
        return coffee.priceInCents() + 50;
    }
}

final class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description() + " + azúcar";
    }

    @Override
    public int priceInCents() {
        return coffee.priceInCents() + 20;
    }
}

public class Main {

    public static void main(String[] args) {
        Coffee plain = new PlainCoffee();
        Coffee decorated = new SugarDecorator(new MilkDecorator(plain));

        System.out.println(plain.description() + " = " + plain.priceInCents() + " céntimos");
        System.out.println(decorated.description() + " = " + decorated.priceInCents() + " céntimos");
    }
}
