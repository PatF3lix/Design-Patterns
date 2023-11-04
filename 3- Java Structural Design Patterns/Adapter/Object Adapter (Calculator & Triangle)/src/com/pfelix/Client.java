package com.pfelix;

public class Client {

    public static void main(String[] args) {
        System.out.println("****Adapter Patern Demo****");

        Triangle t = new Triangle(20, 10);
        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println("Area of triangle is: " + calculatorAdapter.getArea(null));
    }
}
