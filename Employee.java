package com.shrey.day3;

public class Employee {
    int employeeID;
    String employeeName;


    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    void show(){
        System.out.println("Employee's id : " + employeeID + " " + " Name : " + employeeName );
    }
}
