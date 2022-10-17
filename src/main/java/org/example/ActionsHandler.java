package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionsHandler extends AbstractAction {
    JTextField screen;
    public ActionsHandler(String name, JTextField textField){
        this.screen  = textField;
        putValue(Action.NAME,name );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String prev = screen.getText();
        screen.setText(prev + this.getValue(Action.NAME));
    }
}
