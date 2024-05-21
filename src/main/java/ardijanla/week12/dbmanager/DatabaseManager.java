package ardijanla.week12.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static DatabaseManager _instance = null;
    private Connection conn = null;


    public static DatabaseManager getinstance() {

        if (_instance == null) {
            _instance = new DatabaseManager();
        }
        return _instance;

    }

    public Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "root");

            } catch (SQLException s) {
                conn = null;
            }
        }
        return conn;
    }

}
