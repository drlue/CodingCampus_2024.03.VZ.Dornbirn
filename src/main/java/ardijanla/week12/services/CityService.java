package ardijanla.week12.services;

import ardijanla.week12.dbmanager.DatabaseManager;
import ardijanla.week12.models.City;
import ardijanla.week12.models.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityService {


    public void readCities(Country country) {
        DatabaseManager dbm = DatabaseManager.getinstance();
        Connection conn = dbm.getConnection();


        if (conn != null) {
            try (
                    PreparedStatement stmt = conn.prepareStatement("select * from City");
                    ResultSet rs = stmt.executeQuery();
            ) {


                while (rs.next()) {
                    City city = new City(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getFloat(5),
                            rs.getFloat(6)
                    );

                    country.addCity(city);


                }


            } catch (SQLException sqlException) {
                System.out.println("UPS");
            }
        }


    }
}
