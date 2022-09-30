package com.oop.example.abstraction.interfaces;

public class IMale implements IHuman {

    @Override
    public void gender() {
        System.out.println("Male");
    }

    @Override
    public void canMakeBabies() {
        System.out.println("NO");
    }
}
