package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database dbms;

    Connection c = null;

    private Database() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBMSconnectionJava", "postgres", "*********");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Database getInstance() {
        if (dbms == null)
            dbms = new Database();

        return dbms;
    }

    public void query(String sql) {
        System.out.println();
    }


}
