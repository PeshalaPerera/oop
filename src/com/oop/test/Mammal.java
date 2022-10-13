package com.oop.test;

abstract class Mammal implements Animal {
    @Override
    public abstract void sound();

    @Override
    public void feed() {
        System.out.println("Milk...");
    }
}
