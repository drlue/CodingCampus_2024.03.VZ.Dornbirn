package ardijanla.week12.services;

import ardijanla.week12.models.Country;
import ardijanla.week12.dbmanager.DatabaseManager;
import ardijanla.week12.models.World;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class CountryService {


    public void readCountries(World w) {
        DatabaseManager db = DatabaseManager.getinstance();
        Connection conn = db.getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM Country");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    Country country = new Country(
                            rs.getString("Name"),
                            rs.getString("Code"),
                            rs.getString("Capital"),
                            rs.getString("Province"),
                            rs.getFloat("Area"),
                            rs.getInt("Population")
                    );

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

}




