package com.oop.tutorial6;

import java.util.Arrays;

public class CalcManager {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static double cube(int n) {
        return Math.pow(n, 3);
    }

    static double add(double... x) {
        return Arrays.stream(x).sum();
    }

    public static void main(String[] args) {
        System.out.println(isEven(20));
        System.out.println(cube(3));
        System.out.println(add(20, 32, 44, 23, 33));
    }
}
