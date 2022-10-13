package com.oop.tutorial1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to Online Learning!\n" + "Please virus go away!");
        System.out.println(Arrays.toString(args));
        printEvenNumbersWithFor();
        printEvenNumbersWithWhile();
    }

    private static void printEvenNumbersWithFor() {
        System.out.println("\nFor Loops and ifs\n");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void printEvenNumbersWithWhile() {
        System.out.println("\nWhile Loops and ifs\n");
        int n = 0;
        while (n <= 100) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
