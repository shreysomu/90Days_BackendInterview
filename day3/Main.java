package com.shrey.day3;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.name = "Somu";
        student1.id = 23;

        Student student2 = new Student();
        student2.id = 35;
        student2.name = "Kritika";

        Student student3 = new Student();

        System.out.println("Students details : ");
        student1.display();
        student2.display();
        student3.display(); // default constructor


        System.out.println();
        System.out.println("Employee Details using constructor : ");
        Employee employee1 = new Employee(10,"Surubhi");
        Employee employee2 = new Employee(67,"Jaychandra");

        employee1.show();
        employee2.show();

        System.out.println();
        System.out.println("Calculator : ");
        Calculator calculator = new Calculator(10,40);
        System.out.println("Sum: " + calculator.add());
        System.out.println("Difference: " + calculator.subtract());
        System.out.println("Product: " + calculator.multiply());

    }
}
