package com.shrey.day1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        num1 = sc.nextDouble();
        System.out.println("Enter second Number : ");
        num2 = sc.nextDouble();

        double result;

        System.out.println("Choose operation: +  -  *  / %");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum of both number is : " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Subtraction of both number is : " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of both number is : " + result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of both number is : " + result);
                }
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            case '%':
                result = num1 % num2;
                System.out.println("Modulus of both number is : " + result);
                break;

            default:
                System.out.println("Invalid operator!");
        }

    }
}
