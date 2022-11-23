package com.company;
//behaviour
//subclass decide the implementation
abstract class readerfile{
      //  Implement Parent Class
        public void orderdata(){
            readData();
            processData();
            writeData();
        }
    public abstract void readData();
    public abstract void processData();

    public void writeData(){
        System.out.println("Write Data to a Database");
    }
}

class ExcelFile extends  readerfile{

    public void readData(){
        System.out.println("Read Data from Excel File");
    }
    public void processData(){
        System.out.println("Process the Data from Excel File");
    }


}

class TextFile extends readerfile{

    public void readData(){
        System.out.println("Read Data from TextFile");
    }
    public void processData(){
        System.out.println("Process the Data from TextFile");
    }


}


public class Template {

    public static void main(String[] args) {

    }
}
