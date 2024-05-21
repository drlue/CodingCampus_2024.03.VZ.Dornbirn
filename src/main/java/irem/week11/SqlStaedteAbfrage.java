package irem.week11;

import java.sql.*;
import java.util.Scanner;


public class SqlStaedteAbfrage {

    private static final String URL = "jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem";
    private static final String USER = "irem";
    private static final String PASSWORD = "irem";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte den Namen des Landes ein: ");
        String countryName = scanner.nextLine();

        String query = "select city.name, city.population, city.province, longitude, latitude\n" +
                "from city\n" +
                "join country on city.country = country.code\n" +
                "where country.name = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, countryName);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.printf("%-20s %-10s %-20s %-15s %-15s%n", "Name", "Population", "Province", "Longitude", "Latitude");
            System.out.println("------------------------------------------------------------");

            while (resultSet.next()) {
                String cityName = resultSet.getString("name");
                int population = resultSet.getInt("population");
                String province = resultSet.getString("province");
                double longitude = resultSet.getDouble("longitude");
                double latitude = resultSet.getDouble("latitude");

                System.out.printf("%-20s %-10d %-20s %-15.6f %-15.6f%n", cityName, population, province, longitude, latitude);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
