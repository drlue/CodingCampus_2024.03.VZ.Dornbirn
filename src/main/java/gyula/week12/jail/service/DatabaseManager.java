package gyula.week12.jail.service;


import java.sql.*;

public class DatabaseManager {
    private static DatabaseManager _instance = null;
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
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jail?useUnicode=true&characterEncoding=utf8", "gyula", "gyula");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }


}
