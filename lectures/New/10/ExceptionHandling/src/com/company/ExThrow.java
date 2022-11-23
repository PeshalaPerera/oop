package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExThrow {
   public void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public void readfile() throws FileNotFoundException {
       File file= new File("abc.txt");
        FileInputStream fin=new FileInputStream(file);
    }

}
