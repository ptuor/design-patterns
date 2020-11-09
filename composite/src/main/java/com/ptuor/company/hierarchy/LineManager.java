package com.ptuor.company.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class LineManager extends Employee{
    private String department;
    private List<Employee> employees = new ArrayList<>();

    public LineManager(String name, String department){
        super(name);
        this.department = department;
    }


    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public int getNumberOfEmployees() {
        int numberOfSubEmloyees = 0;
        for (Employee employee : employees){
            numberOfSubEmloyees = numberOfSubEmloyees + employee.getNumberOfEmployees();
        }

        return numberOfSubEmloyees + 1;
    }

    @Override
    public void print(String space) {
        System.out.println(space + "Linemanager " + this.getName() + " (" + department + ")");
        for (Employee employee : employees){
            employee.print(space + hierarchySpace);
        }
    }
}
