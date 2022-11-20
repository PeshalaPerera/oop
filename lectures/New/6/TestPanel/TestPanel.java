/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testpanel;

import java.awt.*;
import javax.swing.*;

/**
 * @author b.villarini
 */
public class TestPanel extends JFrame {

    public TestPanel() {

        //p1 -> 12 buttons
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        // add buttons
        // adding the first 9 buttons
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }

        p1.add(new JButton("0"));
        p1.add(new JButton("start"));
        p1.add(new JButton("stop"));

        //p2
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be display here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2, BorderLayout.EAST);
        add(new JButton("Food to be laced here"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TestPanel frame = new TestPanel();
        frame.setTitle("The front view of the microwave oven");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}
