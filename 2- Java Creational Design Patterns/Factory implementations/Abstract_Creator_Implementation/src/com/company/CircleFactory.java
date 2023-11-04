package com.company;


public class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
