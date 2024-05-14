package katherina;

import katherina.week10.objectOrientationAndMySQL.Country;
import katherina.week10.objectOrientationAndMySQL.Welt;

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
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "3v4n3sC4");
            } catch (SQLException sqle){
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }

    public void readCountry(Welt w){
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("Select * FROM country");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Country country = new Country("Name","Code",null, 0);
                    country.setName(rs.getString("Name"));
                    country.setCode(rs.getString("Code"));
                    country.setPopulation(rs.getInt("Population"));
                    w.addCountry(country);
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
