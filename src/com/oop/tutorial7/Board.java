package com.oop.tutorial7;

import java.util.Arrays;
import java.util.Random;

public class Board {
    int ar[][];

    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];

        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }

    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public int findMaxInRow(int row) {
        int[] tempArray = ar[row];
        return findMax(tempArray);
    }

    public int findMaxInColumn(int column) {
        int[] tempArray = new int[ar[0].length];

        for (int i = 0; i < ar.length; i++) {
            tempArray[i] = ar[i][column];
        }

        return findMax(tempArray);
    }

    public int findMaxInDiagonal() {
        return 1;
    }

    private int findMax(int[] array) {
        int max = array[0];

        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }
}
