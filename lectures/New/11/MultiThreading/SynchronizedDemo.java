package com.company;

class  Counter{
    int count;

    public synchronized void increment(){
        count++;
    }   //synchronized
}

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
      //One thread
       Thread t1= new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i=0;i<1000;i++){
                   c.increment();
               }
           }
       });

        //second Thread
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The counter of the count : "+c.count);

    }

}
