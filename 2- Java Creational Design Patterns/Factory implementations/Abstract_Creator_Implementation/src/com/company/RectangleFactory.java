package com.company;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
