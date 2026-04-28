package com.shrey.day5;

abstract class Animal {

    abstract void sound();

    void sleep(){
        System.out.println("Sleeping...........");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog is barking...");
    }
}

