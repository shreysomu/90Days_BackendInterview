package com.shrey.day5;

public interface Payment {
    void pay();
}

class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid using UPI....");
    }

    }

class Card implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid Using card.... ");
    }
}
