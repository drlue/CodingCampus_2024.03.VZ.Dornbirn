package christian.week09.sqlOOP;

import christian.week09.sqlManagment.SqlMondialCityQuery;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class World {

    public static Scanner sc = new Scanner(System.in);

    private ArrayList<Country> listOfCountries;

    public World() {
        listOfCountries = new ArrayList<>();
    }

    //======================================================================================================get=========
    //======================================================================================================set=========
    //======================================================================================================add/remove==

    public void addCountryToList(Country country) {
        if (!listOfCountries.contains(country)) {
            listOfCountries.add(country);
        }
    }
    //======================================================================================================alter=======
    //======================================================================================================print=======

    public void printWorld() {
        for (Country country : listOfCountries) {
            country.printCountry();
        }
    }
    //=====================================================================================================SQL-CRUD=====

    public void startCRUDProcess() {

        int input = 0;
        while (input < 1 || input > 4) {
            System.out.printf("Choose between the following options:\n 1) Insert\n 2) Read\n 3) Update\n 4) Delete\n");
            if (sc.hasNextInt()) {
                input = sc.nextInt();
            }
            sc.nextLine();
        }

        switch (input){
            case 1 :
                System.out.printf("What Insert you want to do? Choose between the following options:\n 1) Country \n2) City\n");
                break;
            case 2 :

                break;
            case 3:

                break;
            case 4:

                break;

        }

    }


    public void alterDatabase() {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?user=root&password=Zmamk_243567");
            prep = conn.prepareStatement("Select * from country");
            rs = prep.executeQuery();
            SqlMondialCityQuery.printResultSet(rs);
        } catch (SQLException sex) {
            sex.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (prep != null) {
                    prep.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sex) {
                sex.printStackTrace();
            }
        }
    }

}
