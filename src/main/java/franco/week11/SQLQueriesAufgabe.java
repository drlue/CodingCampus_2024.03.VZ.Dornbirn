package franco.week11;

import java.sql.*;
import java.util.Scanner;

public class SQLQueriesAufgabe {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prStmt = null;
        ResultSet result = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a country: ");
        String userInput = scan.nextLine();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=franco&password=franco");
            prStmt = conn.prepareStatement("select * from river " +
                    "join geo_river on river.name = geo_river.river " +
                    "join country on country.code = geo_river.country " +
                    "where country.name = ?;");
            prStmt.setString(1, userInput);
            result = prStmt.executeQuery();
            ResultSetMetaData metaData = result.getMetaData();
            for (int col = 1; col < metaData.getColumnCount(); col++) {
//                System.out.println(metaData.getColumnLabel(col) +
//                        " " + metaData.getColumnTypeName(col) + " " +
//                        metaData.getColumnDisplaySize(col));
                System.out.println(metaData.getColumnLabel(col));
                System.out.println(metaData.getColumnName(col));

            }
            while(result.next()){
                //header need to be done

                System.out.printf("  %-8s|   %-8s\n", result.getString(1),result.getString(2));
            }


        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }finally {
            try {
                if(result!=null){
                    result.close();
                }
            }catch (SQLException sqlex){
                sqlex.printStackTrace();
            }try {
                if(prStmt!=null){
                    prStmt.close();
                }
            }catch (SQLException sqlex){
                sqlex.printStackTrace();
            }try {
                if(conn!= null){
                    conn.close();
                }
            }catch (SQLException sqlex){
                sqlex.printStackTrace();
            }
        }

    }
}
