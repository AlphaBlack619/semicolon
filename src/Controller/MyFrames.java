package Controller;

import data.model.MyGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrames implements  ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("+ button");
    JButton button1 = new JButton("- button");
    int count = 0;
    JLabel label = new JLabel("Number of clicks: " + count);
    public MyFrames() {
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(button1);
        panel.add(label);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Phone Book");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);

    }
    public static void main(String[] args) {
        new ContactApp();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
