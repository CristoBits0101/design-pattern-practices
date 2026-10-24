package com.patterns.behavior.visitor.services.implementations;

import com.patterns.behavior.visitor.models.Circle;
import com.patterns.behavior.visitor.models.Rectangle;
import com.patterns.behavior.visitor.services.ShapeVisitor;

public class AreaVisitor implements ShapeVisitor {

    @Override
    public double visit(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
