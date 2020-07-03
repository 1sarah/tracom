package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

    public static void main (String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String mydatabase = "crypsolc_chamasmart";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(url+mydatabase, username, password);
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("insert into employees");

        ResultSet res2 = stmt.executeQuery("insert into payment " +
                "(payment_no, empno, payment_date, description, amount)" +
                "values (10, '102', '28/06/2020', 'salary payment', 90000");

        stmt.close();
        conn.close();
    }
}
