package com.shrey.day1;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        a = sc.nextInt();
        System.out.println("Enter second Number : ");
        b = sc.nextInt();
        System.out.println("Enter third Number : ");
        c = sc.nextInt();

        if(a>b && b>c){
            System.out.println(a + " is the largest number.");
        } else if (b>a && a>c) {
            System.out.println(b + " is the largest number.");
        }

        else {
            System.out.println(c + " is the largest number.");
        }

    }
}
