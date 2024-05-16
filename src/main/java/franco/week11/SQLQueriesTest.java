package franco.week11;

import java.sql.*;
import java.util.Scanner;

public class SQLQueriesTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prStmt = null;
        ResultSet rs = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a country: ");
        String userInput=scan.nextLine();
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=franco&password=franco");
            prStmt= conn.prepareStatement("SELECT * from city\n" +
                    "join country on city.country = country.code\n" +
                    "where country.name = ?;");
            prStmt.setString(1,userInput);
            rs = prStmt.executeQuery();
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
                System.out.printf("%s has %d resident.%n", name, population);
            }

        } catch (SQLException sqle){
            sqle.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException se){}
            }
            if (prStmt != null) {
                try {
                    prStmt.close();
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
