package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamExample {
    public static void main(String[] args) throws IOException {

        File f = new File("new2.txt");
        FileOutputStream fout= new FileOutputStream(f,true);
        fout.write(65); //writing Byte Ascii 65 = A
        fout.write(66); //ascii 66=B

        System.out.println("Success of Byte writing");

        String s="\nOOP Programming";
        byte b[]=s.getBytes(); // converting string into byte array
        fout.write(b);
        System.out.println("Success of string writing");



        fout.close();
    }

}
