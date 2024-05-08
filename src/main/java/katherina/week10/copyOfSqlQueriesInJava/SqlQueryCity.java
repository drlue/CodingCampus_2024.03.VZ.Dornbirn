package katherina.week10.copyOfSqlQueriesInJava;

import java.sql.*;
import java.util.Scanner;

//Zu Lernzwecken kopiert und dann direkt für eine Aufgabe angepasst.

public class SqlQueryCity {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib das Land ein, dessen Städte du sehen willst: ");
        String userChoosenCountry = sc.nextLine();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=3v4n3sC4");

            stmt = conn.prepareStatement("SELECT * from city\n" +
                    "join country on city.country = country.code\n" +
                    "where country.name = ?;");
            stmt.setString(1, userChoosenCountry);
            rs = stmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnLabel(col) + " " +
                        metaData.getColumnTypeName(col) + " " +
                        metaData.getColumnDisplaySize(col)
                        );
            }
            System.out.print("Stadt           |");
            System.out.print("Einwohnerzahl|");
            System.out.println("\n------------------------------");
            while (rs.next()){
                String name = rs.getString(1);
                int population = rs.getInt(4);
                System.out.printf("|%15.25s| %11d |%n", name, population);
            }
            System.out.print("------------------------------");

        } catch (SQLException sqle){
            sqle.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException se){}
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException se){}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se){}
             }
        }

    }
}
