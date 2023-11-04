package com.pfelix;

public class Company {

    public static void main(String[] args) {

        Manager engManager = new Manager("Mike", 25000);
        Manager generalManager = new Manager("Christopher", 50000);

        engManager.addEmployee(new Developer("Patrick", 100, "Pro developer"));
        engManager.addEmployee(new Developer("George", 101, "Entry level Developer"));
        generalManager.addEmployee(new Developer("Tom", 102, "Developer"));

        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();

    }
}
