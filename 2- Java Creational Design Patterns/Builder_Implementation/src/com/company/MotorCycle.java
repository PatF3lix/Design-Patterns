package com.company;

public class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights()  {
        product.add("1 Headlight has been added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
