package lukas.week10.SqlAndOopV1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Country {
    private String name;
    private String code;
    private String capital;
    private String province;
    private float area;
    private int population;

    private Vector<City> cities;

    public Country(String name, String code, String capital, String province, float area, int population) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.province = province;
        this.area = area;
        this.population = population;
        this.cities = new Vector<>();
    }

    public void addCity(City city){
        cities.add(city);
    }

    public void setCitiesOfCountry() {
        String sql = "SELECT ci.name, ci.country, ci.province, ci.population, ci.longitude, ci.latitude FROM city ci JOIN country co on ci.country = co.code WHERE co.name = ?";
        try(
        ResultSet rs = DbFunctions.getRsFromDb(sql, this.name);
        ) {
            while(rs.next()) {
                this.addCity(new City(
                        rs.getString("Name"),
                        rs.getString("Country"),
                        rs.getString("Province"),
                        rs.getInt("Population"),
                        rs.getFloat("Longitude"),
                        rs.getFloat("Latitude")
                        )
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
