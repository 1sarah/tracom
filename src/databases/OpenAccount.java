package databases;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class OpenAccount extends Frame implements ActionListener {
    TextField firstname;
    TextField lastname;
    TextField account_no;
    TextField amount;
    Button btn;


    OpenAccount () {
        btn = new Button("Open Account");
        btn.setBounds(50, 270, 170, 30);

        btn.addActionListener(this);
        add(btn);

        firstname = new TextField();
        firstname.setBounds(50, 70, 170, 30);
        Label firstnameLabel = new Label();
        firstnameLabel.setText("First Name");
        firstnameLabel.setBounds(50, 50, 170, 20);

        lastname = new TextField();
        lastname.setBounds(50, 120, 170, 30);
        Label lastnameLabel = new Label();
        lastnameLabel.setText("Last Name");
        lastnameLabel.setBounds(50, 100, 170, 20);

        account_no= new TextField();
        account_no.setBounds(50, 170, 170, 30);
        Label accountLabel= new Label();
        accountLabel.setText("Account No");
        accountLabel.setBounds(50, 150, 170, 20);

        amount = new TextField();
        amount.setBounds(50, 220, 170, 30);
        Label amountLabel = new Label();
        amountLabel.setText("Amount");
        amountLabel.setBounds(50, 200, 170, 20);


        add(firstname);
        add(lastname);
        add(account_no);
        add(amount);

        add(firstnameLabel);
        add(lastnameLabel);
        add(accountLabel);
        add(amountLabel);



        setSize(400, 400);
        setLayout(null);
        setVisible(true); // setting frame visibility

    }

    public void actionPerformed (ActionEvent e) {

        try {
            Bank b = new Bank("writeUser","passwrite");
            String fname = firstname.getText();
            String lname = lastname.getText();
            int amnt = Integer.parseInt(amount.getText());
            int account = Integer.parseInt(account_no.getText());
            b.openAccount(fname, lname, amnt, account);

        } catch (ClassNotFoundException | SQLException err){
            System.out.println(err.getMessage());
        }



    }

    public static void main (String[] args) {
        new OpenAccount();
    }
}
