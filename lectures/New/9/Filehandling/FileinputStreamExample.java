package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("new2.txt");


//        int i=fin.read(); //read single character
//        System.out.println(i); //Return Ascii Code
//        System.out.println((char)i);

         int i=0;
        while((i=fin.read())!=-1){ //Read All the character
            System.out.print((char)i);
        }

//       int i=0;
//        while((i=fin.read())!=10){ //Read First line
//            System.out.print((char)i);
//        }

        fin.close();

    }
}
