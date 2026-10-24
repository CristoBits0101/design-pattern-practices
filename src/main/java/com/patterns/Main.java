package com.patterns;

/** Ejecuta un ejemplo de cada uno de los 14 patrones del catálogo. */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("\n=== Simple Factory ===");
        com.patterns.creational.factory.Main.main(args);
        System.out.println("\n=== Factory Method ===");
        com.patterns.creational.factorymethod.Main.main(args);
        System.out.println("\n=== Builder ===");
        com.patterns.creational.builder.Main.main(args);
        System.out.println("\n=== Prototype ===");
        com.patterns.creational.prototype.Main.main(args);
        System.out.println("\n=== Singleton ===");
        com.patterns.creational.singleton.Main.main(args);

        System.out.println("\n=== Adapter ===");
        com.patterns.structural.adapter.Main.main(args);
        System.out.println("\n=== Facade ===");
        com.patterns.structural.facade.Main.main(args);
        System.out.println("\n=== Decorator ===");
        com.patterns.structural.decorator.Main.main(args);

        System.out.println("\n=== Strategy ===");
        com.patterns.behavior.strategy.Main.main(args);
        System.out.println("\n=== Observer ===");
        com.patterns.behavior.observer.Main.main(args);
        System.out.println("\n=== Iterator ===");
        com.patterns.behavior.iterator.Main.main(args);
        System.out.println("\n=== Mediator ===");
        com.patterns.behavior.mediator.Main.main(args);
        System.out.println("\n=== State ===");
        com.patterns.behavior.state.Main.main(args);
        System.out.println("\n=== Visitor ===");
        com.patterns.behavior.visitor.Main.main(args);
    }
}
