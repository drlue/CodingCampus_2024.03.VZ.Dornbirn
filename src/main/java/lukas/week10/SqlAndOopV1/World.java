package lukas.week10.SqlAndOopV1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class World {

    private List<Country> countries;
    private List<City> cities;

    public World() {
        countries = new Vector<>();
        cities = new Vector<>();
    }


    public void readCountriesFromDb() {
        ResultSet rs = DbFunctions.getRsFromDb("Select * from Country");
        while (true) {
            try {
                if (!rs.next()) break;
                else {
                    Country country = new Country(
                            rs.getString("Name"),
                            rs.getString("Code"),
                            rs.getString("Capital"),
                            rs.getString("Province"),
                            rs.getFloat("Area"),
                            rs.getInt("Population")
                    );
                    countries.add(country);
                    country.setCitiesOfCountry();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void readCitiesFromDb() {
        ResultSet rs = DbFunctions.getRsFromDb("Select * from City");
        while (true) {
            try {
                if (!rs.next()) break;
                else {
                    City city = new City(
                            rs.getString("Name"),
                            rs.getString("Country"),
                            rs.getString("Province"),
                            rs.getInt("Population"),
                            rs.getFloat("Longitude"),
                            rs.getFloat("Latitude")
                    );
                    cities.add(city);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }


}