package com.oop.tutorial3;

import java.util.Random;

public class BirthdayProblem {
    private static final int numOfDays = 365;

    public static void main(String[] args) {
        int total = 0;
        int terms = 20;

        for (int i = 0; i < terms; i++) {
            total += new BirthdayProblem().calculate();
        }

        System.out.println("Average: " + total / terms);

    }

    private int calculate() {
        Random random = new Random();
        int[] numOfPeople = new int[numOfDays];
        int count = 0;

        do {
            int num = 1 + random.nextInt(numOfDays);

            if (alreadyExists(numOfPeople, num)) {
                break;
            }

            numOfPeople[count] = num;
            count++;
        } while (count < numOfDays);

        return count;
    }

    private boolean alreadyExists(int[] nums, int num) {
        for (int i : nums) {
            if (i == num) return true;
        }

        return false;
    }
}
