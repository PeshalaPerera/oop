package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

//       File f=new File("new1.txt");
//        Scanner sc = new Scanner(f);
//        while (sc.hasNext()){
//            System.out.println(sc.nextLine());

            FileReader fr=new FileReader("new1.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }

    }

