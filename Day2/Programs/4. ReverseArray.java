package com.shrey.day2;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10,23,12,45,67,89,54,17};
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
