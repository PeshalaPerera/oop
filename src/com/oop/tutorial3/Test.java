package com.oop.tutorial3;

import java.awt.*;

public class Test {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    public static void test1() {
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println(bigRiver); // MISSISSIPPI
        String newRiver = river.toLowerCase();
        System.out.println(newRiver); // mississippi
    }

    public static void test2() {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String result1 = animal1.concat(animal2).concat(article).concat(action);
        System.out.println(result1);

        String result2 = animal1 + animal2 + article + action;
        System.out.println(result2);
    }

    public static void test3() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(r1);
//        Rectangle r2 = r1;
        System.out.println(r1);
        r2.grow(10, 20);
        System.out.println(r2);
    }

    public static void test4() {
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);
    }

}
