package com.company;

public class Samsung extends Phone{


    @Override
    public void call() {
        System.out.println("Samsung call");
    }

    @Override
    public void msg() {
        System.out.println("samsung msg ");
    }

    @Override
    public void sleep() {
        System.out.println("samsung sleep ");
    }

}
