package controller;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLUE;
import static java.awt.Color.yellow;
import static javax.swing.JOptionPane.*;

public class GUIController extends JOptionPane {


        public GUIController(){
            this.setBackground(yellow);
            this.setSize(750,500);
            this.icon = new ImageIcon("images(1).png");
        }

        public String input(String prompt){
            return GUIController.showInputDialog(null, prompt);
        }
        public int input(int prompt){
            return Integer.parseInt(showInputDialog(null, prompt));
        }
        public void display(String prompt){
            GUIController.showMessageDialog(null,prompt);
        }
        public void error (String massage, String title){
            showMessageDialog(null,massage,title, ERROR_MESSAGE);}
        public void question (String massage, String title){
            showMessageDialog(null,massage,title, QUESTION_MESSAGE);}
        public void warning (String massage, String title){
            GUIController.showMessageDialog(null,massage,title, WARNING_MESSAGE);}
        public void info (String massage, String title){
            showMessageDialog(null,massage,title, INFORMATION_MESSAGE);}
        ImageIcon imageIcon = new ImageIcon("images(1).png");
        public int options(String prompt, String [] res,String title){return showOptionDialog(null,prompt,
                title, YES_NO_CANCEL_OPTION,
                INFORMATION_MESSAGE,this.icon,res,0);}
    public int question1 (String massage, String title){return showConfirmDialog(null,massage,title,YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);}


        @Override
        public void setBackground(Color gg) {
            super.setBackground(BLUE);
        }

        @Override
        public void setSize(int width, int height) {
            super.setSize(500, 500);
        }
    }

