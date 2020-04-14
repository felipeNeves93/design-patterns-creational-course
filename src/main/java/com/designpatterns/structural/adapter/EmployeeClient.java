package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        // We are going to create an adapter to make possible to add this employee in the list of employees.
        EmployeeLdap employeeFromLdap = new EmployeeLdap("1234", "John", "Wick", "john@wick.com");

        // Adding to the list using the created adapter
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("1234, John, Wick, john@wick.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
