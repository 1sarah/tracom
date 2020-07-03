package myproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyCounter extends Frame implements WindowListener, ActionListener {
    TextField text;
    private int counter = 0;

    public static void main (String[] args) {
        new MyCounter();
    }

    public MyCounter () {
        setLayout(null);
        Button b = new Button("Add");
        text = new TextField();
        b.setBounds(100, 100, 150, 30);
        text.setBounds(100, 150, 150, 30);
        add(b);
        add(text);
        b.addActionListener(this);

        setSize(400, 400);
        setVisible(true); // setting frame visibility
    }

    public void actionPerformed (ActionEvent e) {
        counter ++;
        text.setText("Count: " + counter);
    }

    public void windowClosing (WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened (WindowEvent e) {};
    public void windowClosed (WindowEvent e) {};
    public void windowIconified (WindowEvent e) {};
    public void windowDeiconified (WindowEvent e) {};
    public void windowActivated (WindowEvent e) {};
    public void windowDeactivated (WindowEvent e) {};


}
