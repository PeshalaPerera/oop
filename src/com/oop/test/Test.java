package com.oop.test;

import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.feed();

//        Test test = new Test();
//        test.week1();
    }

    public void week1() {
        forLoop();
        whileLoop();
        referencesAssignment(); //abcabc456
        lottery();
    }

    public void forLoop() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Number: " + i);
            }
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println("Number: " + i);
            }
            i++;
        }
    }

    public void referencesAssignment() {
        String x = "abc";
        String y = x;
        y = new String("123");
        String z = x;
        y = x;
        z = "456";
        System.out.println(x + y + z);
    }

    public void lottery() {
        int min = 1;
        int max = 49;
        int size = 6;
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            int num = min + new Random().nextInt(max);
            if (!alreadyExists(nums, num)) {
                nums[i] = num;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private boolean alreadyExists(int[] nums, int num) {
        for (int i : nums) {
            if (i == num) return true;
        }

        return false;
    }

}
