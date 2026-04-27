package com.shrey.day4;

public class MethodOverloading {

    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 numbers: " + calculator.add(3, 6));
        System.out.println("Sum of 3 numbers: " + calculator.add(5, 6, 7));
    }
}