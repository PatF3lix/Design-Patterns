package com.company;


public class SquareFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
