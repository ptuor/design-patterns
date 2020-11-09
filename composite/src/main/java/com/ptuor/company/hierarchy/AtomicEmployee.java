package com.ptuor.company.hierarchy;

public class AtomicEmployee extends Employee{
    public AtomicEmployee(String name) {
        super(name);
    }

    @Override
    public int getNumberOfEmployees() {
        return 1;
    }

    @Override
    public void print(String space) {
        System.out.println(space + this.getName());
    }
}
