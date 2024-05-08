package irem.week11;

import java.sql.*;
import java.util.Scanner;

public class SqlQuerryTest {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmtPoor = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib ein A ein: ");
        String userChoosenRiver = sc.nextLine();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=irem&password=irem");
            stmt = conn.prepareStatement("select country.name\n" +
                    "from country\n" +
                    "where country.name like 'A%';");

            stmt.setString(1, userChoosenRiver);
            rs = stmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnLabel(col) + " " +
                        metaData.getColumnTypeName(col) + " " +
                        metaData.getColumnDisplaySize(col)
                );
            }
            while (rs.next()) {
                String name = rs.getString(1);
                int population = rs.getInt(4);
                System.out.printf("%s Länder mit A.%n", name);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException se) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException se) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                }
            }
        }
    }
}
