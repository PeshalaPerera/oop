package com.oop.tutorial8;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(getCustomTextField(), BorderLayout.NORTH);
        add(getPanel3(getPanel1(), getPanel2()), BorderLayout.CENTER);
    }

    private JTextField getCustomTextField() {
        JTextField field = new JTextField();
        field.setForeground(Color.BLUE);
        field.setBackground(Color.YELLOW);
        field.setFont(getCustomFont());
        return field;
    }

    private JPanel getPanel3(JPanel... panels) {
        JPanel p3 = getCustomPanel(1, 2);
        for (JPanel p : panels) p3.add(p);
        return p3;
    }

    private JPanel getPanel1() {
        JPanel p1 = getCustomPanel(4, 3);
        setPanelValues(p1, getNumbersArray(), Color.RED);
        return p1;
    }

    private JPanel getPanel2() {
        JPanel p2 = getCustomPanel(4, 1);
        setPanelValues(p2, getActionsArray(), Color.GREEN);
        return p2;
    }

    private void setPanelValues(JPanel panel, String[] values, Color color) {
        for (String value : values) panel.add(getCustomButton(value, color));
    }

    private String[] getNumbersArray() {
        int length = 10;
        String[] array = new String[length + 1];
        for (int i = 0; i < length; i++) array[i] = String.valueOf((i + 1) % length);
        array[length] = "-";
        return array;
    }

    private String[] getActionsArray() {
        return new String[]{"+", "-", "Clear"};
    }

    private JPanel getCustomPanel(int rows, int cols) {
        JPanel panel = new JPanel(new GridLayout(rows, cols));
        panel.setBackground(Color.BLUE);
        return panel;
    }

    private JButton getCustomButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setForeground(Color.BLUE);
        button.setBackground(bgColor);
        button.setFont(getCustomFont());
        return button;
    }

    private Font getCustomFont() {
        return new Font("SansSerif ", Font.BOLD, 16);
    }
}
