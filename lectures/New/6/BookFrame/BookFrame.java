/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bookframe;

import java.util.*;
import javax.swing.*;

/**
 * @author b.villarini
 */
public class BookFrame {

    public static void main(String[] args) {

        Book b1 = new Book("OOP", "Smith", 25.5);
        Book b2 = new Book("Database", "Brown", 30.0);
        // ...

        // create arraylist of Books
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.add(b2);

        BookTableModel tableModel = new BookTableModel(list);
        JTable myTable = new JTable(tableModel);

        JScrollPane panel = new JScrollPane(myTable);

        JFrame myFrame = new JFrame();
        myFrame.add(panel);
        myFrame.setVisible(true);
        myFrame.setSize(400, 200);
    }
}
