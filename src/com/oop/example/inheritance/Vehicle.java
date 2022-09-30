package com.oop.example.inheritance;

public class Vehicle { // adding final here will stop others from inheriting this
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }

    public String getBrand() {
        return brand;
    }
}
