package com.pfelix;

public class Company {

    public static void main(String[] args) {

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(new Developer("Patrick Felix", 100, "Pro developer"));
        engDirectory.addEmployee(new Developer("George Tremblay", 101, "Entry level Developer"));

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(new Manager("Christopher Mondor", 200, "SEO Manager"));
        accDirectory.addEmployee(new Manager("Robert Dimanche", 201, "George's Manager"));

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
