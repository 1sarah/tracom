package myproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Dashboard extends Frame implements WindowListener {
    TextField name;

    public Dashboard (String title, String name) {
        super(title);
        setLayout(null);
        this.name = new TextField("Welcome " + name + "!");
        this.name.setBounds(100, 50, 150, 25);

        add(this.name);
        addWindowListener(this);

        setSize(400, 400);
        setVisible(true); // setting frame visibility
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
