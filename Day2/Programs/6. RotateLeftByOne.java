package com.shrey.day2;

public class RotateLeftByOne {

    public static void rotateLeft(int[] arr){
        int temp = arr[0];

        if(arr.length <= 1) return; //edge case
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {11, 42, 73, 14, 25, 43, 56};
        rotateLeft(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
