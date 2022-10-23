package com.oop.tutorial4;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour

    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate, double speed1, double maxSpeed1) {
        this.licensePlate = licensePlate;
        this.speed = (speed1 < 0) ? 0 : (speed1 > maxSpeed1) ? maxSpeed1 : speed1;
        this.maxSpeed = maxSpeed1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
