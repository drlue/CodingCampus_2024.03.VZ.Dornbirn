package lukas.week11.SqlAndOopV2.model;


import lukas.week11.SqlAndOopV2.dbManager.DbManager;
import lukas.week11.SqlAndOopV2.dbManager.IQueryProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class World {

    private Vector<Country> countries = new Vector<>();


    //---  METHODS ----

    public void addCountry(Country c) {
        if (!countries.contains(c)) {
            countries.add(c);
        }
    }

    public void removeCountry(Country c) {
        countries.remove(c);
    }

//Alternative mit Interface
    public void getCountriesFromDb(DbManager db) {
        String sql = "SELECT Name, Code, Capital, Province, Area, Population FROM country";
        db.getRsFromDb(sql, null, new IQueryProcessor() {
            @Override
            public void process(ResultSet rs) {
                try {
                    while (rs.next()) {
                        Country country = new Country(
                                rs.getString("Name"),
                                rs.getString("Code"),
                                rs.getString("Capital"),
                                rs.getString("Province"),
                                rs.getFloat("Area"),
                                rs.getInt("Population"));

                        addCountry(country);
                        db.readCitiesFromCountry(country);
                    }
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        });
    }

    public Country searchCountryByName(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    //---  PRINT  ----
    public void printStructure() {
        System.out.println("THIS IS THE WORLD");
        if (!countries.isEmpty()) {
            for (Country country : countries) {
                country.printStructure();
            }
        }
    }

}
