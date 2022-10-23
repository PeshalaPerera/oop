package com.oop.test;

import java.awt.*;

public class Tutorial3 {

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
    }

    public static void q1() {
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println(bigRiver);
        String lowerRiver = river.toLowerCase();
        System.out.println(lowerRiver);
    }

    public static void q2() {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        System.out.println(animal1.concat(animal2).concat(article).concat(action));
        System.out.println(animal1 + animal2 + article + action);
    }

    public static void q3() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(r1);
//        Rectangle r2 = r1;
        System.out.println(r1);
        r2.grow(10, 20);
        System.out.println(r2);
    }

    public static void q4() {
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);
    }
}
