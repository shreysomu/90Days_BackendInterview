package com.shrey.day2;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];

        System.out.println("Enter elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0;i< arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);
    }
}
