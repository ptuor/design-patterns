package com.ptuor.company.hierarchy;

public abstract class Employee {
    private String name;
    public static String hierarchySpace = "   ";

    public Employee(String name){
        this.name = name;
    }

    public abstract int getNumberOfEmployees();
    public abstract void print(String s);


    protected String getName() {
        return name;
    }
}
