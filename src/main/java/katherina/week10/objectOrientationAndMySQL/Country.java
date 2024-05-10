package katherina.week10.objectOrientationAndMySQL;

import java.sql.*;
import java.util.Vector;

public class Country {
    private String name;
    private String code;
    private City capital;
    private int population;

    private Vector<City> cities;

    public Country(String name, String code, String nameOfCapital, int population) {
        this.name = name;
        this.code = code;
        this.capital = searchAndCreateCityByName(nameOfCapital);
        this.population = population;
        cities = new Vector<>();
    }

    public City searchAndCreateCityByName(String name){
        for (City c: cities){
            if (c.getName().equals(name)){
                return c;
            }
        }
        City c = new City(name);
        c.setCountry(this);
        cities.add(c);
        return c;
    }

    public void printStructure() {
        for (City city : cities){
            city.printObject();
            city.printStructure();
        }
        System.out.printf("│        ├── %s, %s, %s, %d %n", name, code, capital, population);
    }

    public void printObject() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=3v4n3sC4");

            preparedStatement = connection.prepareStatement("Select * FROM country");
            //preparedStatement.setString(1, "");
            resultSet = preparedStatement.executeQuery();

            System.out.println();
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String code = resultSet.getString(2);
                int population = resultSet.getInt(6);
                System.out.printf("Country %s = new country(\"%s\",\"%s\", %d);%n", code.toLowerCase(), name, code, population);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException se) {
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException se) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException se) {
                }
            }
        }



    }
}