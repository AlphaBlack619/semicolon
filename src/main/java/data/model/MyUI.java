package data.model;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLUE;
import static java.awt.Color.yellow;

public class MyUI  extends JOptionPane {

        public MyUI(){
            this.setBackground(yellow);
            this.setSize(750,500);
            this.icon = new ImageIcon("images(1).png");
        }

        public String input(String prompt){
            return MyUI.showInputDialog(null, prompt);
        }
        public int input(int prompt){
            return Integer.parseInt(showInputDialog(null, prompt));
        }
        public void display(String prompt){
            MyUI.showMessageDialog(null,prompt);
        }
        public void error (String massage, String title){
            showMessageDialog(null,massage,title, ERROR_MESSAGE);}
        public void question (String massage, String title){
            JOptionPane.showMessageDialog(null,massage,title,JOptionPane.QUESTION_MESSAGE);}
        public void warning (String massage, String title){
            MyUI.showMessageDialog(null,massage,title,JOptionPane.WARNING_MESSAGE);}
        public void info (String massage, String title){
            JOptionPane.showMessageDialog(null,massage,title,JOptionPane.INFORMATION_MESSAGE);}
        ImageIcon imageIcon = new ImageIcon("images(1).png");
        public int options(String prompt, String [] res,String title){return JOptionPane.showOptionDialog(null,prompt,
                title, JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,this.icon,res,0);}

        @Override
        public void setBackground(Color gg) {
            super.setBackground(BLUE);
        }

        @Override
        public void setSize(int width, int height) {
            super.setSize(500, 500);
        }
    }
