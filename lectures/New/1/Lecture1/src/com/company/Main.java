package com.company;

import sun.text.normalizer.UCharacterIterator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    /*static class mobileimp implements Mobile{

     @Override
     public void show() {
         System.out.println("Show the value");
     }
 }*/

    public static void main(String[] args) {
       /* ArrayList<Vehicle> vehi = new ArrayList<Vehicle>();
        for (int i = 0; i < 5; i++) {
            Vehicle v1 = new Vehicle();
            System.out.println("Enter the name of the vehicle :");
            Scanner Sc = new Scanner(System.in);
            String name = Sc.nextLine();
            v1.setName(name);
            vehi.add(v1);
        }
        Iterator E = vehi.iterator();
        while (E.hasNext()) {
            Vehicle v = (Vehicle) E.next();
            System.out.println(v.getName());




        Circle c1=new Circle(12);
        System.out.println("After the circle no 1 :"+Circle.getCount());
        Circle c2= new Circle(20);
        System.out.println("After the circle no 2 :"+Circle.getCount());}

   //    Parent p1=new Parent();
    //   Parent p2= new Parent(3);
        Child c1= new Child(45);
        c1.phone();
        Parent p1= new Parent();
        System.out.println(c1 instanceof Parent);
        System.out.println(p1 instanceof Child);
*/
        Samsung s= new Samsung();
        s.call();
        s.setColor("red");
        System.out.println(s.getColor());

       /*
       Mobile n= new Mobile() {
           @Override
           public void show() {
               System.out.println("Hello");
           }
       };
       n.show();
*/





    }
}
