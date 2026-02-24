package com.shrey.day2;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,34,13,78,54,77,33,21,22};
        int key = 33;
        int ind = -1;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == key){
                ind = i;
                break;
            }
        }

        if(ind != -1){
            System.out.println("Key element is found at : " +ind);
        }
        else {
            System.out.println("Not found !");
        }
    }
}
