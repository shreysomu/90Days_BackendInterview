package com.shrey.day1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sc.nextInt();
        if((n&1) == 0)
            System.out.println("Number is Even.");
        else
            System.out.println("Number is odd.");
    }
}
