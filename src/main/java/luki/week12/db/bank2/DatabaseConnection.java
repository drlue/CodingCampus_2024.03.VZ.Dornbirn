package luki.week12.db.bank2;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private String url;
    private String user;
    private String password;
    private Connection conn = null;

    public DatabaseConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void open() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, password);
        }
    }

    public void close() throws SQLException {
        if(conn != null) {
            try {
                conn.close();
            } finally {
                conn = null;
            }
        }
    }

    public Connection getConn() {
        if(conn == null) {
            throw new RuntimeException("Connection is not opened!");
        }
        return conn;
    }

}
