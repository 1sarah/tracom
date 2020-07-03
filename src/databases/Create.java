package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create {

    public static void main (String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String mydatabase = "crypsolc_chamasmart";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(url+mydatabase, username, password);
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("create table payment (" +
                "(payment_no int NOT NULL," +
                "empno int NOT NULL," +
                "payment_date char(50) not null," +
                "description char(50) not null," +
                "amount int," +
                "constraint payment_pk primary key(payment_no)");

        ResultSet res2 = stmt.executeQuery("insert into payment " +
                "(payment_no, empno, payment_date, description, amount)" +
                "values (10, '102', '28/06/2020', 'salary payment', 90000");

        stmt.close();
        conn.close();
    }
}
