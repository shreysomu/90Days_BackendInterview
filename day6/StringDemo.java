package com.shrey.day6;

public class StringDemo {
    public static void main(String[] args) {

        //🔹 Program 1: String Immutability
        String str = "Java";
        str.concat("Developer");

        System.out.println(str); // Java

        str = str.concat("Backend");
        System.out.println(str);




        //🔹 Program 2: == vs equals()
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);   // ? true
        System.out.println(a == c);   // ? false
        System.out.println(a.equals(c)); // ? true


        //StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Backend");
        System.out.println(sb);  //Java Backend

    }
}
