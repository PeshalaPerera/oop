package com.company;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws IOException{

        FileInputStream fin=new FileInputStream("cardetails.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);
        System.out.println(objin.available());
        try {
            Car c1= (Car) objin.readObject();
            System.out.println(c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
