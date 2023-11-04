package com.pfelix;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle triangle) {
        t = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rect = new Rectangle();
        rect.length = t.base;
        rect.width = 0.5 * t.height;

        return calculator.getArea(rect);
    }
}
