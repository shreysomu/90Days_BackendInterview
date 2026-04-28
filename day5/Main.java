package com.shrey.day5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sleep();
        animal.sound();


        //Interface....
        System.out.println("Interface : ");
        Payment payment = new UPI();
        payment.pay();

        Payment payment1 = new Card();
        payment1.pay();
    }
}
