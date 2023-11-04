package com.company;

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }
}
