package com.company;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceA();  // the injector
        Client client = new Client(service); // injects via the constructor
        client.doSomething();

        client.setService(service);  // injects via a setter injection
    }
}
