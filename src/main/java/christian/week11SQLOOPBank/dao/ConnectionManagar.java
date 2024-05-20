package christian.week11SQLOOPBank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionManagar {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankschema?user=root&password=Zmamk_243567");
            }
        } catch (SQLException sex) {
            sex.printStackTrace();
        }
        return conn;
    }
    public static void closeConnection(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

