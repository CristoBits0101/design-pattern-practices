package com.patterns.behavior.visitor.models;

import com.patterns.behavior.visitor.services.ShapeVisitor;

// Cada elemento permite que un visitante ejecute una operación sobre él.
public interface Shape {

    double accept(ShapeVisitor visitor);
}
