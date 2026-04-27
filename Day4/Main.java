package com.shrey.day4;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Animal dog2 = new Animal();
        Animal dog4 = new Dog();
        Dog dog5 = new Dog();

        animal1.sound();
        dog1.sound(); // Inheriting parent's method/property
        dog1.bark();
      //  animal1.bark(); ---->> can't access child class's method/variable
        dog2.sound();
        dog4.sound();

        dog5.bark();
        dog5.sound();
    }
}
