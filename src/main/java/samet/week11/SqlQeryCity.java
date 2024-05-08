package samet.week11;

import java.sql.*;
import java.util.Scanner;

public class SqlQeryCity {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Country: ");
        String userChoosenCountry = sc.nextLine();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=samet&password=samet");
            stmt = conn.prepareStatement("SELECT * from city join country on city.country = country.code where country.name = ?;");
            stmt.setString(1,userChoosenCountry);
            rs = stmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();

            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnLabel(col) + " " +
                        metaData.getColumnTypeName(col) + " " +
                        metaData.getColumnDisplaySize(col));
            }
            while (rs.next()){
                String name = rs.getString(1);
                int population = rs.getInt(4);
                System.out.printf("|- %-35s hat %-10s Einwohner. -|%n", name, population);
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        } finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException se){}
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException se){}
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException se){}
            }
        }
    }
}
