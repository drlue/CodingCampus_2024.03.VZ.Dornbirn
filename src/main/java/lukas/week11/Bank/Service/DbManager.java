package lukas.week11.Bank.Service;

import java.sql.*;

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

    public Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "lukas", "#StrengGeheim!");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }

    public void showBanks(){
        conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select bic, name from bank");
            ResultSet rs = ps.executeQuery();

            //TODO: rs processing

            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
