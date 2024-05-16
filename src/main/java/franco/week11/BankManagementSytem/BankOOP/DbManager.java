package franco.week11.BankManagementSytem.BankOOP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
    private static DbManager _instance = null;
    private Connection conn = null;

    private DbManager() {
    }

    public static DbManager getInstance() {
        if (_instance == null) {
            _instance = new DbManager();
        }
        return _instance;
    }

    public Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/francobank?"+
                        "user=franco&password=franco");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }
}
