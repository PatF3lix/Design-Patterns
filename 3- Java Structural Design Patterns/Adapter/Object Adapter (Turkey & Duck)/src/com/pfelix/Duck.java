package com.pfelix;

interface Duck {
    void quack();
    void fly();
}
//Target
class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
