/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Barbara
 */
public class PersonTableModel extends AbstractTableModel{
    
    
    private String[] columnNames = {"Name","Date of Birth","Type"}; 
    private ArrayList<Person> list; 
    
    public PersonTableModel(ArrayList<Person> personList){
        list = personList;
    }

    @Override
    public int getRowCount() {
        return list.size();   
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null; 
        if (columnIndex == 0) { 
         temp = list.get(rowIndex).getName(); 
      } 
      else if (columnIndex == 1) { 
         temp = list.get(rowIndex).getDOB().getDate(); 
      } 
      else if (columnIndex == 2) { 
          if(list.get(rowIndex) instanceof Teacher)
            temp = "Teacher"; 
          else
            temp = "Student";
      } 
      return temp; 
        
    }
    
    // needed to show column names in JTable 
   public String getColumnName(int col) { 
      return columnNames[col]; 
   } 
   
//   public Class getColumnClass(int col) { 
//      if (col == 2) { 
//         return Double.class; 
//      } 
//      else { 
//         return String.class; 
//      } 
//   } 
    
}
