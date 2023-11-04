package com.pfelix;

public interface CalculatorInterface {
    // target interface
    double getArea(Rectangle r);
}
//Adaptee
class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}