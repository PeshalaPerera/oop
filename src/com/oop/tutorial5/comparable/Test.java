package com.oop.tutorial5.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(50);
        BankAccount ba2 = new BankAccount(20);
        BankAccount ba3 = new BankAccount(30);

        // put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);

        // call the library sort method
        Collections.sort(list);

        // print out the sorted list
        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }

}
