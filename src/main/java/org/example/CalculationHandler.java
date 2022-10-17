package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculationHandler extends AbstractAction{
    private JTextField screen;
    private static int num1, num2, result;
    private String action;
    private static int state;
    public CalculationHandler(String name, JTextField textField){
        this.screen  = textField;
        num1 = 0;
        num2 = 0;
        result = 0;
        action = "";
        state = 0;
        putValue(Action.NAME,name );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       action = (String)this.getValue(Action.NAME);

       if(!action.equals("=")){
           num1 = Integer.parseInt(screen.getText());
           screen.setText("");
           switch (action){
               case "+":
                   state = 1;
                   break;
               case "-":
                   state = 2;
                   break;
               case "*":
                   state = 3;
                   break;
               case "/":
                   state = 4;
                   break;
           }
       }
       else{
           num2 = Integer.parseInt(screen.getText());
           System.out.println(state);
           switch (state){
               case 1:
                   result = num1 + num2;
                   break;
               case 2:
                   result = num1 - num2;
                   break;
               case 3:
                   result = num1 * num2;
                   break;
               case 4:
                   result = num1 / num2;
                   break;
           }

            screen.setText(result+"");
       }
    }
}
