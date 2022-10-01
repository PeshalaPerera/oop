package com.oop.tutorial1.exercises;

public class ReferencesAssignment {

    public static void main(String[] args) {
        String x = "abc";
        String y = x;
        y = new String("123");
        String z = x;
        y = x;
        z = "456";
        System.out.println(x + y + z); //abcabc456
    }

}
