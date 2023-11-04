package com.company;

public class Rectangle implements Shape {
    public double length;
    public double width;

    public double calculateArea()
    {
        return length * width;
    }
}
