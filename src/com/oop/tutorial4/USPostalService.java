package com.oop.tutorial4;

import java.util.Scanner;

public class USPostalService {

    static String[] digits = {"11000", "00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"};
    static int multipleValue = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the zip below: ");
        String zip = "95014"; // input.next();

        int total = 0;
        StringBuilder output = new StringBuilder();

        for (char c : zip.toCharArray()) {
            int digit = Character.getNumericValue(c);
            total += digit;
            output.append(digits[digit]);
        }

        int checkDigit = multipleValue - (total % multipleValue);
        output.append(digits[checkDigit]);

        String barcode = output.toString().replace("1", "|").replace("0", ":");
        System.out.println("Barcode: " + barcode);  // "|:|:::|:|:||::::::||:|::|:::||"
    }
}
