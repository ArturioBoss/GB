package ui;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
//    public boolean calc=false;
    public Calculator() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 3));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        ActionButtonListener abListener = new ActionButtonListener(outField);
        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottom.add(plusBtn);
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        JButton multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(abListener);
        bottom.add(multiplyBtn);
        JButton splitBtn = new JButton("/");
        splitBtn.addActionListener(abListener);
        bottom.add(splitBtn);
        JButton cancelBtn = new JButton("C");
        cancelBtn.addActionListener(abListener);
        bottom.add(cancelBtn);
        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(abListener);
        bottom.add(submitBtn);

        mainFrame.setVisible(true);
    }
}
