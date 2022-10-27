package com.oop.tutorial5;

import java.util.Arrays;

public class Student implements Printable {
    private String name;
    private String[] grades;

    @Override
    public void print() {
        System.out.printf("Name: %s, Grades: %s", name, Arrays.toString(grades));
    }
}
