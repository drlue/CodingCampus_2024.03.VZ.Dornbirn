package samet.week12.SqlOoP.DatabaseManager;

import samet.week12.SqlOoP.City;
import samet.week12.SqlOoP.Country;
import samet.week12.SqlOoP.World;

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

    public Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=samet&password=samet");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }

    public void readCountry(World w) {
        getConn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM country");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Country country = new Country();
                    country.setCountryName(rs.getString("Name"));
                    country.setCode(rs.getString("Code"));
                    country.setCapital(rs.getString("Capital"));
                    country.setProvince(rs.getString("Province"));
                    country.setArea(rs.getFloat("Area"));
                    country.setPopulation(rs.getInt("Population"));
                    w.addCountry(country);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }

    public void readCity(World world) {

        getConn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM city");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    City city = new City();
                    city.setCityName(rs.getString("Name"));
                    city.setPopulation(rs.getInt("Population"));

                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
                conn = null;


            }
        }
    }
}
