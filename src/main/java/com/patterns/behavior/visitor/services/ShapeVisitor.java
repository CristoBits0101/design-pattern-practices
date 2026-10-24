package com.patterns.behavior.visitor.services;

import com.patterns.behavior.visitor.models.Circle;
import com.patterns.behavior.visitor.models.Rectangle;

// El visitante ofrece una operación específica para cada tipo de elemento.
public interface ShapeVisitor {

    double visit(Circle circle);

    double visit(Rectangle rectangle);
}
