package com.company;

public class Singleton {

    // the private reference to the one and only instance
//    volatile is used for synchronization with the synchronized keyword
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;
//    private constructor
    private Singleton() {}

//    reduces the bottle-neck and the overhead of always having synchronization
    public static Singleton getInstance()
    {
        if (uniqueInstance == null) {
            // we only synchronize the first time through
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
