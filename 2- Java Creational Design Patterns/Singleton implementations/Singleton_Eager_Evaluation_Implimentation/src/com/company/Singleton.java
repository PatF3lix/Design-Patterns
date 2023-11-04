package com.company;

public class Singleton {

    // the private reference to the one and only instance
//    instance is created at the time of class loading
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    private Singleton() {}

    public static Singleton getInstance()
    {
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
