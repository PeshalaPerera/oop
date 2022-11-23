package com.company;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID=1L; //to ensure that same class has been
    // used to serilazation and De-serialization

    int weight;
    int Height;
    String Model;


    public Car(int weight, int height, String model) {
        this.weight = weight;
        Height = height;
        Model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", Height=" + Height +
                ", Model='" + Model + '\'' +
                '}';
    }
}
