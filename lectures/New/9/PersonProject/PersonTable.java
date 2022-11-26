/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Barbara
 */
public class PersonTable extends JFrame{
    
    JTable myTable;
    PersonTableModel tableModel;
    ArrayList<Person> list;
    
    // contructor
    public PersonTable(ArrayList<Person> list){
        this.list = list;
        tableModel = new PersonTableModel(list);
        myTable =  new JTable(tableModel);
        
        setBounds(10,10,400,300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        myTable.setAutoCreateRowSorter(true);
        
        // color code the type of person: if it is a teacher is green, if student is blue
        myTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer(){
                Color originalColor = null;

                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
                Component renderer =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value == "Teacher") {
                renderer.setBackground(Color.GREEN);
            } else {
                renderer.setBackground(Color.BLUE);
            }

           
            return renderer;
        }
});
      
         JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 
        
        JPanel panel = new JPanel(); 
        panel.add(scrollPane); 
         add(panel,BorderLayout.CENTER); 
        
    }
    
    
}
