package com.company;

public abstract class Phone {
    private int no;
    private String color;
    public  abstract  void call(); //abstract method
    public abstract void msg(); // abstract method

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sleep(){ //regular method
        System.out.println("sleep phone");
    }
}


