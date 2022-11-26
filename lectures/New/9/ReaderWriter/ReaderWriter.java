/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Barbara
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;


public class ReaderWriter {

    private String name;
    private int id;
    private int mark;

    public static void main(String[] args) {
        ReaderWriter readwrite = new ReaderWriter();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
        System.out.println("Menu:");
        System.out.println("1 - Write Student to file");
        System.out.println("2 - Read Student List from a file");
        System.out.println("3 - Exit");
        System.out.println("Enter your choice: ");
        int m = sc.nextInt();
        switch (m) {
            case 1:
               
                System.out.println("Enter name Student :");
                String name = sc.next();
                System.out.println("Enter ID Student :");
                int id = sc.nextInt();
                System.out.println("Enter mark Student :");
                int mark = sc.nextInt();

                readwrite.inputStudent(name, id, mark);

                break;
            case 2:
                System.out.println("List student: ");
                System.out.println("------------------" + "\n");
                readwrite.loadListStudent();
                break;
            case 3:
                exit = true;
                break;
        }
        }

    }

    public void inputStudent(String name, int id, int mark) {
        try {

            //open
            FileWriter fw = new FileWriter("List", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            //write
            bw.write("Name: " + name + "\n");
            bw.write("Id:" + id + "\n");
            bw.write("Mark: " + mark + "\n");
            bw.write("-----------------" + "\n");

            bw.flush();
            System.out.println("Done");
            
            //close
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadListStudent() {
        try {
            //open
            FileReader fr = new FileReader("List");
            BufferedReader br = new BufferedReader(fr);
            
            //read
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


