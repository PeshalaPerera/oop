package com.oop.tutorial9;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileHandling {
    private static final String fileName = "List";

    private static void addStudentToFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Enter name Student :");
        String name = sc.next();
        System.out.println("Enter ID Student :");
        int id = sc.nextInt();
        System.out.println("Enter mark Student :");
        int mark = sc.nextInt();

        bw.write("Name: " + name + "\n");
        bw.write("Id:" + id + "\n");
        bw.write("Mark: " + mark + "\n");
        bw.write("-----------------" + "\n");
        bw.flush();
        bw.close();
        fw.close();
    }

    private static void displayStudents() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String data;

        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
        fr.close();
    }

    private static void handleInput(int item) throws IOException {
        switch (item) {
            case 1:
                addStudentToFile();
                break;
            case 2:
                displayStudents();
                break;
            case 3:
                System.out.println("Exiting Program!!!");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("Menu\n1 - Add Student in the List and save to file\n2 - Read Students List from a file and display on the screen\n3 - Exit\nEnter your choice: ");
            handleInput(new Scanner(System.in).nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Entered menu item does not exists");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: Cannot write to file!");
        }
    }
}
