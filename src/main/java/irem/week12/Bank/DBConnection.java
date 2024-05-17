package irem.week12.Bank;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection _instance = null;

    private Connection conn = null;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (_instance == null) {
            _instance = new DBConnection();
        }
        return _instance;
    }

    public Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/irembank?"+
                        "user=irem&password=irem");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }
}

//    private Connection conn = null;
//
//    private DBConnection() {
//    }
//
//    public static DBConnection getInstance() {
//        if (_instance == null) {
//            _instance = new DBConnection();
//        }
//        return _instance;
//    }
//
//    public Connection getConn() {
//        if (conn == null) {
//            try {
//                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/irembank?" +
//                        "user=irem&password=irem");
//            } catch (SQLException sqle) {
//                sqle.printStackTrace();
//                conn = null;
//            }
//        }
//        return conn;
//    }
//}

//    private static final String URL = "jdbc:mysql://localhost:3306/irembank?";
//    private static final String USER = "irem";
//    private static final String PASSWORD = "irem";
//
//    public static Connection getConnection() throws SQLException {
//        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
//    }
