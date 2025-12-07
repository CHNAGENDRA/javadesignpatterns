package com.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Unknown shape type: " + type);
    }
}
