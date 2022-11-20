package com.oop.tutorial8;

import javax.swing.*;

public class MyCalculator {
    public static void main(String[] args) {
        CalculatorFrame myCalculator = new CalculatorFrame("My Calculator");
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
