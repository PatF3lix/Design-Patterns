package com.company;

public class Main {

    public static void main(String[] args) {
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm1 = new Projector();

        cm. setDisplayModule(dm);
        cm. display();
        cm. setDisplayModule(dm1);
        cm. display();
    }
}
