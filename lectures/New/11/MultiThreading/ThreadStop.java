package com.company;

class ThreadToStop extends Thread{
    private boolean exit = false;

    public void run(){
        while(!exit){
            System.out.println("Thread is running...");
        }
        System.out.println("Thread is stopped!");
    }

    public void stopThread(){
        exit = true;
    }
}


public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        ThreadToStop thread = new ThreadToStop();
        thread.start();
        Thread.sleep(500);
        thread.stopThread();

    }
}
