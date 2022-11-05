package com.oop.tutorial6;

public class Address {
    String street;
    int number;
    String city;

    public Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    void print() {
        System.out.println(number + " " + street + " " + city);
    }
}
