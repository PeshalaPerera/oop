package com.company;

import sun.awt.windows.ThemeReader;

class threaddemo extends Thread{
    int total;

    public synchronized void run(){
        for (int i=1;i<=100;i++){
            total=total+i;
        }
       this.notify();
    }
}

public class waitnotifyexample {
    public static void main(String[] args) throws InterruptedException {
        threaddemo t1=new threaddemo();
        t1.start();


        synchronized (t1) {
            t1.wait(10);
        System.out.println(t1.total);

    }
    }
}
