package irem.week11;

import java.sql.*;
import java.util.Scanner;

public class SqlAbfrageStaedteNachProvinz {


    public static void main(String[] args) {
        Connection verbindung = null;
        PreparedStatement abfrage = null;
        ResultSet ergebnis = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie den Namen einer Provinz ein: ");
        String gewaehlteProvinz = sc.nextLine();
        try {

            verbindung = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem");

            String sql = "SELECT city.name, city.population, city.latitude, city.longitude " +
                    "FROM city " +
                    "JOIN province ON city.province = province.name " +
                    "WHERE province.name = ?;";

            abfrage = verbindung.prepareStatement(sql);
            abfrage.setString(1, gewaehlteProvinz);
            ergebnis = abfrage.executeQuery();

            System.out.println("Stadt | Einwohner | Breitengrad | Längengrad");

            while (ergebnis.next()) {
                String stadtName = ergebnis.getString("name");
                int einwohner = ergebnis.getInt("population");
                double breitengrad = ergebnis.getDouble("latitude");
                double laengengrad = ergebnis.getDouble("longitude");
                System.out.printf("%s | %d | %.2f | %.2f%n", stadtName, einwohner, breitengrad, laengengrad);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {

            if (ergebnis != null) {
                try {
                    ergebnis.close();
                } catch (SQLException ignoriert) {
                }
            }
            if (abfrage != null) {
                try {
                    abfrage.close();
                } catch (SQLException ignoriert) {
                }
            }
            if (verbindung != null) {
                try {
                    verbindung.close();
                } catch (SQLException ignoriert) {
                }
            }
        }
    }
}


//jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem