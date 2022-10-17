package org.example;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JPanel{

    JTextField screen;
    public Buttons(JTextField screen){
        this.screen = screen;
        this.setLayout(new GridLayout(0,3));
        createButtons();
        createActionButton();

    }
    public void createButtons(){
        for(int i =1; i <= 9; i++){
            JButton btn = new JButton(new ActionsHandler(i+"", screen));
            this.add(btn);
        }
    }

    public void createActionButton(){
        JButton sum = new JButton(new CalculationHandler("+", screen));
        JButton rest = new JButton(new CalculationHandler("-", screen));
        JButton multiply = new JButton(new CalculationHandler("*", screen));
        JButton divide = new JButton(new CalculationHandler("/", screen));
        JButton result = new JButton(new CalculationHandler("=", screen));

        this.add(sum);
        this.add(rest);    this.add(multiply);    this.add(divide);
        this.add(result);
    }
}
