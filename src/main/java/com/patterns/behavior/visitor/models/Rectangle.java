package com.patterns.behavior.visitor.models;

import com.patterns.behavior.visitor.services.ShapeVisitor;

public final class Rectangle implements Shape {

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
        // Aquí "this" es Rectangle y selecciona visit(Rectangle).
        return visitor.visit(this);
    }
}
