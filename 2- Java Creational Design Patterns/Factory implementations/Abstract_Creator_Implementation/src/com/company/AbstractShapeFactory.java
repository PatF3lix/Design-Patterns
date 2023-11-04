package com.company;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    // other helper methods
}
