package com.patterns.behavior.visitor;

import java.util.List;

import com.patterns.behavior.visitor.models.Circle;
import com.patterns.behavior.visitor.models.Rectangle;
import com.patterns.behavior.visitor.models.Shape;
import com.patterns.behavior.visitor.services.ShapeVisitor;
import com.patterns.behavior.visitor.services.implementations.AreaVisitor;
import com.patterns.behavior.visitor.services.implementations.PerimeterVisitor;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(3), new Rectangle(4, 5));
        ShapeVisitor areaVisitor = new AreaVisitor();
        ShapeVisitor perimeterVisitor = new PerimeterVisitor();

        // Las mismas figuras aceptan operaciones distintas sin cambiar sus clases.
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName()
                    + ": área = " + shape.accept(areaVisitor)
                    + ", perímetro = " + shape.accept(perimeterVisitor));
        }
    }
}
