package franco.week11.dbManager;

import franco.week11.OOP_JDBC.Country;
import franco.week11.OOP_JDBC.World;
import franco.week11.SQLQueriesTest;

import java.sql.*;

public class DatabaseManager {
    private PreparedStatement prStmnt = null;
    private ResultSet rs = null;
    private static DatabaseManager _instance = null;
    private Connection conn = null;

    public static DatabaseManager getInstance() {
        if (_instance == null) {
            _instance = new DatabaseManager();
        }
        return _instance;
    }

    public Connection getConnectionToDB() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?" +
                        "user=franco&password=franco");
            } catch (SQLException sqle) {
                System.out.println("Connection failed...");
                sqle.printStackTrace();
                //conn set to null again if something wrong
                conn = null;
            }
        }
        return conn;
    }

    public void readCountry(World monde) {
        getConnectionToDB();
        if (conn != null) {
            try {
                prStmnt = conn.prepareStatement("Select * From country");
                rs = prStmnt.executeQuery();
                while (rs.next()) {
                    Country pays = new Country();
                    pays.setName(rs.getString("Name"));
                    pays.setCode(rs.getString("Code"));
                    pays.setCapital(rs.getString("Capital"));
                    pays.setPopulation(rs.getInt("Population"));
                    monde.addCountry(pays);
                }
                rs.close();
                prStmnt.close();

            } catch (SQLException sqle) {
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                    conn = null;
                }
            }
        }
    }

}
