package com.pfelix;
//Abstraction
abstract class Vehicle {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    protected Vehicle( WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manuFacture();
}

class Car extends Vehicle {

    public Car(WorkShop w1, WorkShop w2) {
        super(w1, w2);
    }

    @Override
    public void manuFacture() {
        System.out.println("Car ");
        workShop1.work();
        workShop2.work();
    }
}

class Bike extends Vehicle {

    public Bike(WorkShop w1, WorkShop w2) {
        super(w1, w2);
    }

    @Override
    public void manuFacture() {
        System.out.println("Bike ");
        workShop1.work();
        workShop2.work();
    }
}
