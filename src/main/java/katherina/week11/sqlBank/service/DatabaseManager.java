package katherina.week11.sqlBank.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {  private static DatabaseManager _instance = null;
    private Connection conn = null;

    private DatabaseManager() {
    }

    public static DatabaseManager getInstance() {
        if (_instance == null) {
            _instance = new DatabaseManager();
        }
        return _instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "root", "3v4n3sC4");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }
}
