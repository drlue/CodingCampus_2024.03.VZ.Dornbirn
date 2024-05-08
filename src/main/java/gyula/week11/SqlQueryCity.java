package gyula.week11;

import java.sql.*;
import java.util.Scanner;


// Germany' AND 1=2 UNION SELECT Name, 'a', 'b', Area from Country #

public class SqlQueryCity {
    public static void main(String[] args) {
        Connection conn = null;
//        Statement stmtPoor = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib ein Staat Name ein: ");
        String userChoosenCountry = sc.nextLine();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=gyula&password=gyula");
/*
            !!! ALARM !!! GEFÄHRLICHES CODE

            stmtPoor = conn.createStatement();
            rs = stmtPoor.executeQuery("SELECT city.name, city.country, city.province, city.Population from city " +
                    "join country on city.country = country.code " +
                    "where country.name = '" + userChoosenCountry + "'");
 */
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

            while (rs.next()){
                String name = rs.getString(1);
                int population = rs.getInt(4);
                System.out.printf("%s hat %d Einwohner.%n", name, population);
            }

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
