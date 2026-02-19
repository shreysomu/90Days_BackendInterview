package com.shrey.day1;

import java.util.Scanner;

public class PrintFirstNnaturalNumber {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        for(int i = 1 ;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
