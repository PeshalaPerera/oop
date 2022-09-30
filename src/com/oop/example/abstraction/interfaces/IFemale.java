package com.oop.example.abstraction.interfaces;

public class IFemale implements IHuman {

    @Override
    public void gender() {
        System.out.println("Female");
    }

    @Override
    public void canMakeBabies() {
        System.out.println("YES");
    }
}
