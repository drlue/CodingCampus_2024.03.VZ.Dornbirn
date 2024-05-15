package samet.week11;

import java.sql.*;
import java.util.Scanner;

public class SqlQueryCityPopulationAmerica {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Continent");
        String userChoosenContinent = scanner.nextLine();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=samet&password=samet");
            statement = connection.prepareStatement("from encompasses\n" +
                    "join continent on encompasses.Continent = continent.name\n" +
                    "join country on encompasses.Country = Country.code\n" +
                    "join city on encompasses.Country = city.Country\n" +
                    "where continent.Name = ?\n" +
                    "order by city.Population desc");
            statement.setString(1, userChoosenContinent);
            resultSet = statement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();

            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnLabel(col) + " " +
                        metaData.getColumnTypeName(col) + " " +
                        metaData.getColumnDisplaySize(col));
            }
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int population = resultSet.getInt(4);
                System.out.printf("|-- %-35s hat %-10s Einwohner. --|%n", name, population);
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
            if (statement != null) {
                try {
                    statement.close();
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