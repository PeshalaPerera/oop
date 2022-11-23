package com.company;

public class Main {

    public static void main(String[] args) {
        //Using Extends Thread
//        MyThread t=new MyThread();
//	    t.start();
//        for (int i=0;i<10;i++){
//            System.out.println("Inside the main Thread "+i);
//        }

        //Using implementing Runnable
        MyRunnable m=new MyRunnable();
        Thread t=new Thread(m);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Inside the main Thread "+i);
        }



    }
}
