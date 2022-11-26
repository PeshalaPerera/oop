/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShowImagePkg;

import java.awt.*;       // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers

public class ShowImageFrame extends JFrame{
    
    JButton btnOne;
    JButton btnTwo;
    JLabel lblImage;
    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;
    
    public ShowImageFrame(){
      
      Container cp = getContentPane();
      // set layout in the main panel
      cp.setLayout(new BorderLayout());
      cp.setBackground(Color.blue);
      
      // create a panel with two buttons in a grid
      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(1,2));
      //create and add buttons
      btnOne = new JButton("One");
      p1.add(btnOne);
      
      btnTwo = new JButton("Two");
      p1.add(btnTwo);
      
      // create a label with a default image
      try{
      imageIconZero = new ImageIcon(getClass().getResource("zero.png"));
      }catch (NullPointerException e){
          System.out.println("Image zero not found");
      }
      lblImage = new JLabel(imageIconZero, JLabel.CENTER);
      
      //add the jlabel on the top
      cp.add(lblImage, BorderLayout.CENTER);
      
      //add the button on the bottom
      cp.add(p1, BorderLayout.SOUTH);
      
      // instantiate the other two images
      try{
      imageIconOne = new ImageIcon(getClass().getResource("one.png"));
      }catch(NullPointerException e){
          System.out.println("Image one not found");
      }
      
      try{
      imageIconTwo = new ImageIcon(getClass().getResource("two.png"));
      }catch(NullPointerException e){
          System.out.println("Image two not found");
      }
      
      // add event handler
      MyListener myListener = new MyListener();
      btnOne.addActionListener(myListener);
      btnTwo.addActionListener(myListener);
      
      // add mouse listener to the jLabel
      lblImage.addMouseListener(myListener);
      
    }
    
    private class MyListener extends MouseAdapter  implements ActionListener{
     
      public void actionPerformed(ActionEvent evt) {
          String btnLabel = evt.getActionCommand();
          
       // event.getActionCommand() returns the button's label
        if (btnLabel.equals("One")) {
            lblImage.setIcon(imageIconOne);
            
        } else if (btnLabel.equals("Two")) {
            lblImage.setIcon(imageIconTwo);
        }
    }
      
      public void mouseClicked(MouseEvent evt){
          lblImage.setIcon(imageIconZero);
      }

        
   }
    
     // The entry main() method
   public static void main(String[] args)  {
      // Invoke the constructor by allocating an anonymous instance
      ShowImageFrame myFrame = new ShowImageFrame();
      
      myFrame.setSize(600, 400);       // "super" Frame sets initial size
      myFrame.setTitle("My Frame");           // "super" Frame sets title
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);                  // show "super" Frame
      
      
   }
    
    
}
