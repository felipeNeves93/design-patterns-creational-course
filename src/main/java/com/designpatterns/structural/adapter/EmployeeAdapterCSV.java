package com.designpatterns.structural.adapter;

// If there are fields added, than this isn't more an adapter, but a Decorator.
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getFirstName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
