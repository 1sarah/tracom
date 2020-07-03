package myproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login extends Frame implements WindowListener, ActionListener {
    TextField username;
    TextField password;
    Button login;

    public static void main (String[] args) {
        new Login("Login");
    }

    public Login(String title) {
        setLayout(null);
        Button login = new Button("Login");
        username = new TextField("Username", 20);
        password = new TextField("Password", 20);
        username.setBounds(100, 50, 150, 25);
        password.setBounds(100, 100, 150, 25);
        login.setBounds(100, 150, 150, 25);

        add(username);
        add(password);
        add(login);
        login.addActionListener(this);
        addWindowListener(this);

        setSize(400, 400);
        setVisible(true); // setting frame visibility
    }

    public void actionPerformed (ActionEvent e) {
        String name, pass;
        name = username.getText();
        pass = password.getText();

        if (checkPassword(pass) && checkUsername(name)) {
            new Dashboard("Dashboard", username.getText());
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public void windowClosing (WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public static boolean checkUsername (String username) {
        if (username.equals("Username") || username.equals("") || username.equals("username")) {
            return false;
        }
        return true;
    }

    public static boolean checkPassword (String password) {
        if (password.equals("Password") || password.equals("password") || password.equals("") || password.length() < 4 ) {
            return false;
        }

        return true;
    }

    public void windowOpened (WindowEvent e) {};
    public void windowClosed (WindowEvent e) {};
    public void windowIconified (WindowEvent e) {};
    public void windowDeiconified (WindowEvent e) {};
    public void windowActivated (WindowEvent e) {};
    public void windowDeactivated (WindowEvent e) {};

}
