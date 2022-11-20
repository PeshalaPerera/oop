/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookframe;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author b.villarini
 */
public class BookTableModel extends AbstractTableModel {

    //properties
    private ArrayList<Book> myList;
    private String[] columnNames = {"Title", " Author", "Price"};

    //contructor
    public BookTableModel(ArrayList<Book> list) {
        myList = list;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;

        if (columnIndex == 0) { // first coloumn - title
            temp = myList.get(rowIndex).getTitle();

        } else if (columnIndex == 1) { // second coloumn - author
            temp = myList.get(rowIndex).getAuthor();

        } else if (columnIndex == 2) { // third coloumn - price
            temp = myList.get(rowIndex).getPrice();

        }
        return temp;

    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
}
