package com.company;

public class Singleton {

//    The private static reference to the one and only instance
    private static Singleton uniqueInstance = null;

//    a instance attribute
    private int data = 0;

//private constructor
    private Singleton() {};

    public static  Singleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
//        return ref to the uniqueInstance Obj
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }



}
