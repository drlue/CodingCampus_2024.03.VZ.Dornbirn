package christian.week09.sqlManagment.SqlOOP.Database;

import christian.week09.sqlManagment.SqlOOP.model.Continent;
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

            }
        } catch (SQLException sex) {
            sex.printStackTrace();
        }
    }

    public void readCountryFromDB(){

    }
}
