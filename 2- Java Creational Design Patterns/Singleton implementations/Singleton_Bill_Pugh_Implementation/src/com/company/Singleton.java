package com.company;

public class Singleton {

    // an instance attribute
    private int data = 0;

    private Singleton() {}

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
//        the final key word is what makes this possible, once the uniqueInstance is created once it is then constant
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance()
    {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
