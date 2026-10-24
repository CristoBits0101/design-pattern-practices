package com.patterns.behavior.visitor;

/*
 * Problema: añadir operaciones sobre distintas figuras sin editar sus clases.
 * Idea: cada figura acepta un visitante que conoce su tipo concreto.
 * Observa: área y perímetro se calculan sobre las mismas figuras.
 */
interface Shape {
    double accept(ShapeVisitor visitor);
}

interface ShapeVisitor {
    double visit(Circle circle);
    double visit(Rectangle rectangle);
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double accept(ShapeVisitor visitor) {
        // Aquí this tiene tipo Circle y selecciona visit(Circle).
        return visitor.visit(this);
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}

final class AreaVisitor implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}

final class PerimeterVisitor implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }
}

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(4, 5)};
        ShapeVisitor area = new AreaVisitor();
        ShapeVisitor perimeter = new PerimeterVisitor();

        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.accept(area)
                    + " | Perímetro: " + shape.accept(perimeter));
        }
    }
}
