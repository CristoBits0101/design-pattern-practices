package com.patterns.behavior.visitor.models;

import com.patterns.behavior.visitor.services.ShapeVisitor;

public final class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double accept(ShapeVisitor visitor) {
        // Aquí "this" es Circle y selecciona visit(Circle).
        return visitor.visit(this);
    }
}
