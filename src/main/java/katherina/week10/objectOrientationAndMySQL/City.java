package katherina.week10.objectOrientationAndMySQL;

import java.sql.*;

public class City {
    private String name;
    private Country country;
    private int population;

    public City(String name) {
        this(name, 0);
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
        this.country = null;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void printStructure() {
        System.out.printf("│               ├── %s, %d %n", name, population);

    }

    public void printObject() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=3v4n3sC4");

            preparedStatement = connection.prepareStatement("Select capital FROM country");
            //preparedStatement.setString(1, "");
            resultSet = preparedStatement.executeQuery();

            System.out.println();
            while (resultSet.next()) {
                String name = resultSet.getString(1);
               // int population = resultSet.getInt(6);
                System.out.printf("City %s = new City(\"%s\");%n", name.toLowerCase().replaceAll("", "x"), name /*,population*/);
                ;
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
