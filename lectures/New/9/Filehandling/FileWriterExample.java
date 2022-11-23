package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        //File name as a parameter
        FileWriter fw=new FileWriter("new1.txt"); // default it will override
      //FileWriter fw=new FileWriter("new1.txt",true); //It will append

        //File Object
        File f=new File("new.txt");
        FileWriter fw1=new FileWriter(f);

        fw.write("JAva File Handling \n");
        fw.write("ABCD \n");
        fw.write("123");

        fw.close();
    }
}
