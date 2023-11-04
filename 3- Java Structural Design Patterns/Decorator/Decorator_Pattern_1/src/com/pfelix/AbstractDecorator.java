package com.pfelix;

/*
* Conforms to the Component interface
* will have a reference to the component object
* And it defines the interface that conforms to the components interface
* */
abstract class AbstractDecorator extends Component  {
    protected Component com;

    public void setCom(Component com) {
        this.com = com;
    }

    @Override
    public void doJob() {
        if(com != null) {
            com.doJob();
        }
    }
}

/*Concrete decorator
* Add additional responsibilities to our concrete component*/

class ConcreteDecoratorEX_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        //do what is intended in the concrete component
        super.doJob();
        //then add additional functionality as needed
        System.out.println("I am explicitly from Ex_1");
    }
}
class ConcreteDecoratorEX_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println();
        System.out.println("***START Ex-2***");
        //do what is intended in the concrete component
        super.doJob();
        //then add additional functionality as needed
        System.out.println("I am explicitly from Ex_2");
        System.out.println("***END. Ex-2***");
    }
}
