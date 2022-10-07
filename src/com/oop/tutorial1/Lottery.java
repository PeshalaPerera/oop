package com.oop.tutorial1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Lottery Numbers\n");

        int count = 6;
        int min = 1;
        int max = 49;

        withArray(count, min, max);
        withArrayList(count, min, max);
    }

    private static void withArrayList(int count, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();

        while (numbers.size() < count) {
            int num = (int) (Math.random() * 100);
            if (num > min && num < max && !numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println(numbers);
    }

    private static void withArray(int count, int min, int max) {
        int[] numbers = new int[count];
        int index = 0;

        while (index < count) {
            int num = (int) (Math.random() * 100);
            if (num > min && num < max && !alreadyExists(numbers, num)) {
                numbers[index] = num;
                index++;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static boolean alreadyExists(int[] array, int num) {
        for (int j : array) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
