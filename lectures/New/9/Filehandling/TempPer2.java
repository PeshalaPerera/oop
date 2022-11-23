package com.company;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class TempPer2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("carinfo.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);
        ArrayList<Car> carread = new ArrayList<>();

        while (true){
            try {
                Car c= (Car) objin.readObject();
                carread.add(c); //readed object -> arraylist
            }
            catch (IOException | ClassNotFoundException e){
                break;
            }

        }
        System.out.println(carread);
    }
}
