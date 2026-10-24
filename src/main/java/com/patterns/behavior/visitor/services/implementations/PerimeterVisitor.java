package com.patterns.behavior.visitor.services.implementations;

import com.patterns.behavior.visitor.models.Circle;
import com.patterns.behavior.visitor.models.Rectangle;
import com.patterns.behavior.visitor.services.ShapeVisitor;

// Añade otra operación sin editar Circle ni Rectangle.
public class PerimeterVisitor implements ShapeVisitor {

    @Override
    public double visit(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }
}
