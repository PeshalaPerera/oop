/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CounterPkg;

import java.awt.*;       // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;    // Using Swing components and containers

public class Counter extends JFrame{
    
   private JLabel lblCount;      // Declare component JLabel
   private JTextField tfCount;  // Declare component JTextField
   private JButton btnCount;    // Declare component JButton
   private JButton btnCountDown;    // Declare component JButton
   private JButton btnReset;    // Declare component JButton
   private int count = 0;      // counter's value
   
    // Constructor to setup UI components and event handlers
   public Counter () {
       // sets layout to FlowLayout, which arranges
       // Components from left-to-right, then top-to-bottom.
      Container cp = getContentPane();
      // change background color
      cp.setBackground(Color.yellow);
      cp.setLayout(new FlowLayout());
      
      lblCount = new JLabel("Counter"); // Construct component Label
      cp.add(lblCount);                   // "super" Frame adds Label
 
      tfCount = new JTextField(count + "", 10); // Construct component TextField
      tfCount.setEditable(false);               // read-only
      cp.add(tfCount);                             // "super" Frame adds TextField
 
      btnCount = new JButton("Count Up");   // Construct component Button
      cp.add(btnCount);                    // "super" Frame adds Button
      
      btnCountDown = new JButton("Count down");   // Construct component Button
      cp.add(btnCountDown);                    // "super" Frame adds Button
      
      btnReset = new JButton("Reset");   // Construct component Button
      cp.add(btnReset);                    // "super" Frame adds Button
      
      MyListener handler = new MyListener();
      btnCount.addActionListener(handler);
      btnCountDown.addActionListener(handler);
      btnReset.addActionListener(handler);

   }
   
   private class MyListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
          String btnLabel = evt.getActionCommand();
       // event.getActionCommand() returns the button's label
        if (btnLabel.equals("Count Up")) {
            ++count; 
            tfCount.setText(count + "");
            
   } else if (btnLabel.equals("Count down")) {
       --count; 
       tfCount.setText(count + "");
   } else if (btnLabel.equals("Reset")){
      count = 0; 
      tfCount.setText(count + "");
   }
      }
   }

   
   // The entry main() method
   public static void main(String[] args)  {
      // Invoke the constructor by allocating an anonymous instance
      JFrame mycounter = new Counter();
      // change background color
      mycounter.setBackground(Color.yellow);
      
      mycounter.setSize(600, 100);       // "super" Frame sets initial size
      mycounter.setTitle("My Counter");           // "super" Frame sets title
      mycounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mycounter.setVisible(true);                  // show "super" Frame
      
      
   }
    
}
