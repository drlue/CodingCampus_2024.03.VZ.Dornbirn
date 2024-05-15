package irem.week12.Bank;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem";
    private static final String USER = "irem";
    private static final String PASSWORD = "irem";

    public static Connection getConnection() throws SQLException, SQLException {
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);

    }
}


