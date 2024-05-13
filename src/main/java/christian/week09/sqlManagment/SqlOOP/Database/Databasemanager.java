package christian.week09.sqlManagment.SqlOOP.Database;

import christian.week09.sqlManagment.SqlOOP.model.Continent;
import christian.week09.sqlManagment.SqlOOP.model.Country;
import christian.week09.sqlManagment.SqlOOP.model.World;


import java.sql.*;

public class Databasemanager {
    private static Databasemanager _Instance = null;
    private Connection conn = null;

    private Databasemanager() {

    }

    //================================================================================================get=========

    public static Databasemanager getInstance() {
        if (_Instance == null) {
            _Instance = new Databasemanager();
        }
        return _Instance;
    }
    //================================================================================================set=========
    //================================================================================================create=========
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL=========

    public void getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=Zmamk_243567");
            } catch (SQLException sex) {
                sex.printStackTrace();
            }
        }
    }

    public void readContinentFromDB(World world) {
        try {
            PreparedStatement prep = conn.prepareStatement("Select * from Continent");
            ResultSet rs = prep.executeQuery();

            while (rs.next()) {
                Continent c = new Continent(
                        rs.getString("name"),
                        rs.getInt("area")
                );
                world.addContinentToList(c);
                readCountryFromDB(c);
            }
        } catch (SQLException sex) {
            sex.printStackTrace();
        }
    }

    public void readCountryFromDB(Continent continent){
        try {
            PreparedStatement prep = conn.prepareStatement("Select * from Country join encompasses on country.code = encompasses.country where encompasses.continent = ?");
            prep.setString(1,continent.getName());
            ResultSet rs = prep.executeQuery();

            while (rs.next()) {
                Country c = new Country(
                        rs.getString("name"),
                        rs.getInt("population"),
                        rs.getString("code")
                );
                continent.addCountryToList(c);

            }
        } catch (SQLException sex) {
            sex.printStackTrace();
        }
    }
}
