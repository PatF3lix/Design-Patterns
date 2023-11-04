package com.pfelix;

public class Client {

    public static void main(String[] args) {
	    Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());

        vehicle2.manuFacture();
        vehicle1.manuFacture();
    }
}
