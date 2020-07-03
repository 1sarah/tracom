package myproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementingActionListener extends Frame implements ActionListener {
    TextField myTextField;
    Label myLabel;

    ImplementingActionListener () {
        Button b = new Button("Click me");
        b.setBounds(100, 120, 170, 30);
        myLabel.setText("I am a label");
        b.addActionListener(this);
        add(b);
        add(myTextField);
        add(myLabel);
        setSize(400, 400);
        setLayout(null);
        setVisible(true); // setting frame visibility

    }

    public void actionPerformed (ActionEvent e) {
        myTextField.setText("Action listener implemented");
        myLabel.setText("Action listener implemented on me as a label");
    }

    public static void main (String[] args) {
        new ImplementingActionListener();
    }
}
