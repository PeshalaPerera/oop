package com.oop.tutorial6;

class Cell2 {
    int x;

    Cell2(int x) {
        this.x = x;
        System.out.println("Cell2 constructor called");
    }
}

class TinyCell2 extends Cell2 {
    TinyCell2() {
        super(1);
        System.out.println("TinyCell2 constructor called");
    }
}

class MicroscopicCell2 extends TinyCell2 {
    MicroscopicCell2() {
        System.out.println("MicroscopicCell constructor called");
    }
}

public class CellTest2 {
    public static void main(String[] args) {
        Cell2 c = new MicroscopicCell2();
    }
}
