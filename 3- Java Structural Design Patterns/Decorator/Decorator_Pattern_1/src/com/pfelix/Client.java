package com.pfelix;

public class Client {

    public static void main(String[] args) {

        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEX_1 cd_1 = new ConcreteDecoratorEX_1();

        //Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1
        cd_1.setCom(cc);
        cd_1.doJob();

        ConcreteDecoratorEX_2 cd_2 = new ConcreteDecoratorEX_2();

        //Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1 & ConcreteDecoratorEx_2
        cd_2.setCom(cd_1);
        cd_2.doJob();
    }
}
