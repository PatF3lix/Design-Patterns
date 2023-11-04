package com.pfelix;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp: employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
