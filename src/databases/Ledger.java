package databases;

import java.sql.Connection;

public class Ledger {

    public static void main (String[] args) {
        Account acc = new Account(
                "jdbc:postgresql://localhost:5432/example",
                "postgres",
                "password");

        Connection acConn = acc.connect();

        Account ledger = new Account(
                "jdbc:postgresql://localhost:5432/example",
                "postgres",
                "password");
    }
}
