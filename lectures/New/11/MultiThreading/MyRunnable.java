package com.company;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Inside the Child Thread Runnable "+i);
        }
    }
}
