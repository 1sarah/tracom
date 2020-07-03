package databases;

import java.sql.*;

public class Example1 {

    public static void main (String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String mydatabase = "crypsolc_chamasmart";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(url+mydatabase, username, password);
        Statement stmt = conn.createStatement();
        int res = stmt.executeUpdate("update sys_users set fname='Peter', lname='kamau' where id='8' ");

        System.out.println(res + " Data updated successfully");
        stmt.close();
        conn.close();
    }
}
