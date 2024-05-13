package gyula.week12.dbmanager;

import gyula.week12.model.Continent;
import gyula.week12.model.World;

import java.sql.*;

public class DatabaseManager {
    private static DatabaseManager _instance = null;
    private Connection conn = null;

    private DatabaseManager(){
    }

    public static DatabaseManager getInstance(){
        if (_instance == null){
            _instance = new DatabaseManager();
        }
        return _instance;
    }

    public Connection getConnection(){
        if (conn == null){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "gyula", "gyula");
            } catch (SQLException sqle){
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }

    public void readContinents(World w){
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT name, area FROM continent");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Continent c = new Continent();
                    c.setName(rs.getString("Name"));
                    c.setArea(rs.getFloat("Area"));
                    w.addContinent(c);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle){
                try {
                    conn.close();
                } catch (SQLException e){}
                conn = null;
            }
        }
    }
}
