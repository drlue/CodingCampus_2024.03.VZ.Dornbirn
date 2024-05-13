package irem.week11;

import java.sql.*;
import java.util.Scanner;


    public class SqlAbfrageFlussNachLand {

    public static void main(String[] args) {
        Connection verbindung = null;
        PreparedStatement abfrage = null;
        ResultSet ergebnis = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie den Namen eines Landes ein: ");
        String gewaehltesLand = sc.nextLine();

        try {
            verbindung = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem");

            String sql = "SELECT river.name, river.length, river.sourceelevation, river.mouth " +
                    "FROM river " +
                    "JOIN country ON river.country = country.code " +
                    "WHERE country.name = ?;";

            abfrage = verbindung.prepareStatement(sql);
            abfrage.setString(1, gewaehltesLand);
            ergebnis = abfrage.executeQuery();

            System.out.println("Fluss | Länge (km) | Quellhöhe (m) | Mündung");

            while (ergebnis.next()) {
                String flussName = ergebnis.getString("name");
                int laenge = ergebnis.getInt("length");
                int quellHoehe = ergebnis.getInt("source elevation");
                String muendung = ergebnis.getString("mouth");
                System.out.printf("%s | %d | %d | %s%n", flussName, laenge, quellHoehe, muendung);
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


