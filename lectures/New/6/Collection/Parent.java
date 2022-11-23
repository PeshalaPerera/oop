package com.company;

public class Parent implements Comparable{
    int a;
    int b;
    int c;

    public Parent(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
