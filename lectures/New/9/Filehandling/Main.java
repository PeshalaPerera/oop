package com.company;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //initialize in to a string variable
        String filename= "new2.txt";

        //sending the file name or directory name to the file object
        File f1=new File(filename);
        f1.createNewFile();
        //Directly uses file name
        File f2=new File("new.txt");
        f2.createNewFile();

        File f3=new File(f1,"new3.txt"); //parent // child
        File f4= new File("C:\\test.txt");

       // Details from f1
        System.out.println("File name : " + f1.getName()); //Returns the name of the file or directory
        System.out.println("Path : " + f1.getPath()); //Returns the  pathname
        System.out.println("Absolute path : " + f1.getAbsolutePath()); //Returns the absolute pathname
        System.out.println("Parent : " + f1.getParent());
        System.out.println("Exists : " + f1.exists());
        System.out.println("Can Read : " + f1.canRead());
        System.out.println("Can Write: " + f1.canWrite());

        System.out.println("\n");
        // Details from f3
        System.out.println("File name : " + f3.getName());
        System.out.println("Path : " + f3.getPath());
        System.out.println("Absolute path : " + f3.getAbsolutePath());
        System.out.println("Parent : " + f3.getParent());
        System.out.println("Exists : " + f3.exists());
        System.out.println("Can Read : " + f3.canRead());
        System.out.println("Can Write: " + f3.canWrite());

        System.out.println("\n");
        System.out.println("Parent of F4: "+f4.getParent());
    }
}
