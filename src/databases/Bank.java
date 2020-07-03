package databases;

import org.postgresql.util.PSQLException;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Bank {


    private final String url = "jdbc:mysql://localhost/tracomdb";
    private final String username ;
    private final String password ;

    public Bank( String username,String password) throws ClassNotFoundException {
       Class.forName("com.mysql.jdbc.Driver");
       this.username=username;
       this.password=password;
   }
    public static void main(String[]args) throws ClassNotFoundException, SQLException {
//       Bank x=new Bank("writeUser","passwrite");
//       x.printTransactions();
        Bank y=new Bank("readuser", "passread");
        y.update(100000,865438 );
    }
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the DB server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Exiting...");
            System.exit(1);
        }
        return conn;
    }

    public void openAccount(String fname, String lname, double amount, int account_no) throws SQLException {

        try (Connection conn = connect()) {
            String sql = "Insert INTO transactions set firstname=? , lastname=? , amount=?, account_no = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
            preparedStatement.setDouble(3, amount);
            preparedStatement.setInt(4, account_no);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void printTransactions() throws SQLException {
        Connection conn= null;
        try{
            conn = connect();
            Statement print = conn.createStatement();
            String sql="SELECT * from transactions";
            ResultSet rs = print.executeQuery(sql);

            while(rs.next()){
                String fname=rs.getString("firstname");
                String lname=rs.getString("lastname");
                String amount=rs.getString("amount");
                String account_no=rs.getString("account_no");

                System.out.printf("%10s %10s %10s %10s %n", fname,lname,amount,account_no);
            }
            print.close();

        }catch (SQLException e){

            System.out.println("Oopps! Error printing transactions: "+ e.getMessage());
        }finally {
            conn.close();

        }
    }

    public void update(double amount, int acc) throws SQLException {

        Connection conn = null;
        try{
             conn = connect();
            String sql="update transactions set amount=? where account_no= "+acc;
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setDouble(1,amount);
            stm.executeUpdate();
            stm.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            conn.close();
        }


    }
}



