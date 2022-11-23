package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {
    public static void main(String[] args) throws IOException {
        File f1= new File("cardetails.txt");
        f1.createNewFile();

        FileOutputStream fout = new FileOutputStream(f1);
        ObjectOutputStream objout = new ObjectOutputStream(fout); //expected outstream

        Car c1= new Car(150,120,"toyota");
        Car c2= new Car(190,100,"Mahindra");
         objout.writeObject(c1);
         objout.writeObject(c2);


         objout.close();
         fout.close();
    }
}
