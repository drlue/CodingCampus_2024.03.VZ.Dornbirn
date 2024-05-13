package christian.week09.SQLOOP2.DBManager;

import christian.week09.SQLOOP2.Model.Continent;
import christian.week09.SQLOOP2.Model.Country;
import christian.week09.SQLOOP2.Model.World;

import java.sql.*;

public class DataBaseManager {

    private static DataBaseManager instance = null;

    private Connection conn = null;

    private DataBaseManager() {

    }

    public static DataBaseManager getInstance() {
        if(instance == null){
            instance = new DataBaseManager();
        }
        return instance;
    }

    public void getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?user=root&password=Zmamk_243567");
            } catch (SQLException sex) {
                sex.printStackTrace();
                conn = null;
            }

        }
    }

    public void readContinent(World world) {
        getConnection();
        try {
            PreparedStatement prep = conn.prepareStatement("Select * from continent");
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                Continent continent = new Continent(
                        rs.getString("name"),
                        rs.getFloat("area")
                );
                world.addContinent(continent);
                readCountry(continent);
            }
            prep.close();
            rs.close();
        } catch (SQLException sex) {
            sex.printStackTrace();
        }


    }

    public void readCountry(Continent continent) {
        getConnection();
        try {
            PreparedStatement prep = conn.prepareStatement("Select * from Country where ");
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                Country country = new Country(
                        rs.getString("name"),
                        rs.getString("continent"),
                        rs.getInt("population")
                );
                continent.addCountryToList(country);
            }
            prep.close();
            rs.close();
        } catch (SQLException sex) {
            sex.printStackTrace();
        }


    }
}
