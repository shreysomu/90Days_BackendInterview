package com.shrey.day4.methodOverriding;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); //RunTime Polymorphism
        animal1.sound();

        Animal animal2 = new Animal();
        animal2.sound();

        Dog dog1 = new Dog();
        dog1.sound();

    }
}
