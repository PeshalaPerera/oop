package com.company;

import java.util.Scanner;

public class Exceptionhandlingdemo {
    public static void main(String[] args) {
        try {
            String s = null;//critical statement
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception Occured :");
            System.out.println(e);
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}