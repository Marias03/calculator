package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){

        JTextField screen = new JTextField();
        screen.setEnabled(false);
        screen.setBackground(new Color(128, 98, 128));
        screen.setFont(new Font("sans-serif", 1, 30));
        this.add(screen);

        Buttons buttons = new Buttons(screen);
        this.add(buttons);
        createWindow();
    }

    public void createWindow(){
        this.setLayout(new GridLayout(2,0));
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        this.setBounds(toolkit.getScreenSize().width /4, toolkit.getScreenSize().height / 4, 500, 500);
    }

}
