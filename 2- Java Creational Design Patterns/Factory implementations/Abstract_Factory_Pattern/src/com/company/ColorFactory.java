package com.company;

public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
//does not follow the integration/segregation principle
    @Override
    Shape getShape(String shape) {
        return null;
    }
}
