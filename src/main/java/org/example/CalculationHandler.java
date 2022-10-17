package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculationHandler extends AbstractAction{
    JTextField screen;
    public CalculationHandler(String name, JTextField textField){
        this.screen  = textField;
        putValue(Action.NAME,name );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String action = (String)this.getValue(Action.NAME);
       int num1 = 0;
        switch (action){
            case "+":
                num1 = Integer.parseInt(screen.getText());
                screen.setText("");
                break;
            case "-":
                num1 = Integer.parseInt(screen.getText());
                screen.setText("");
                break;
            case "*":
                num1 = Integer.parseInt(screen.getText());
                screen.setText("");
                break;
            case "/":
                num1 = Integer.parseInt(screen.getText());
                screen.setText("");
                break;
        }
        if(action.equals("=")){
            System.out.println();
            int num2 = Integer.parseInt(screen.getText());
            int result = num1 + num2;
            screen.setText(result+"");
        }
    }
}
