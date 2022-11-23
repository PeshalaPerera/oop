package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TempPer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner Sc = new Scanner(System.in);
        String model;
        int weight;
        int height;
        ArrayList<Car> cars = new ArrayList<>(); //Arraylist to Store the Cars Information

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Car " + (i + 1) + " Information");
            System.out.println("Weight :");
            weight = Sc.nextInt();
            System.out.println("Height :");
            height = Sc.nextInt();
            System.out.println("Model :");
            model = Sc.next();
            Car c1 = new Car(weight, height, model);
            cars.add(c1); //adding data to arraylist
        }

        File file = new File("carinfo.txt");
        FileOutputStream fout = new FileOutputStream(file, true); //Append
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        Iterator it = cars.iterator();
        while (it.hasNext()) {
            Car carnew = (Car) it.next();
            objout.writeObject(carnew);
        }
    }}