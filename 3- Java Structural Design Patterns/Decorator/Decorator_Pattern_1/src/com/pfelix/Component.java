package com.pfelix;

//Defines the interface for the objects.
//It can have responsibilities added to them dynamically from the decorator.
abstract class Component {
    public abstract  void doJob();
}

//Concrete component, this is the object to which we want to add additional responsibilities to,
//This is the code you do not want to modify.
class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a concrete Component - I am closed for modification");
    }
}