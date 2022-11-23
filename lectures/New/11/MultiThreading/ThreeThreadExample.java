package com.company;
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("\t From ThreadA: i= "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("\t From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("\t From ThreadC: k= "+k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exit from C");
    }
}

public class ThreeThreadExample {
   public static void main(String[] args) throws InterruptedException {
        A a=new A();
        B b=new B();
        C c=new C();
        a.setPriority(Thread.MAX_PRIORITY);//10
        b.setPriority(Thread.MIN_PRIORITY);//1
        a.start();
        b.start();
        c.start();
        a.join(); //Join method wait until the thread move to dead state.
        b.join();
        c.join();
     System.out.println("Bye bye!!!");




    }
}
