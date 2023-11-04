package com.company;

public class Main {

    public static void main(String[] args) {
	    Shape circle = new CircleFactory().getShape();
        Shape square = new SquareFactory().getShape();
        Shape rectangle = new RectangleFactory().getShape();
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
