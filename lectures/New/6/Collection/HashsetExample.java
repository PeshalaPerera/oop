package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        HashSet<Child> set1=new HashSet();
        Child c1= new Child(1, 2 ,3,4);
        set1.add(c1);


        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

}
}
