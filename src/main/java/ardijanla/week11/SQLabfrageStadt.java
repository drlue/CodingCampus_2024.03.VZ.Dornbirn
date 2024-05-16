package ardijanla.week11;

import java.sql.*;
import java.util.Scanner;

public class SQLabfrageStadt {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("gib ein land ein");
        String input = "Austria";


        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "root");
                PreparedStatement pstmt = conn.prepareStatement("select city.name,city.province,city.population " +
                        "from country " +
                        "join city on city.country = country.code " +
                        "where country.name = ?;");
        ) {

            pstmt.setString(1, input);
            ResultSet resultSet = pstmt.executeQuery();

            for (int i = 1; i < resultSet.getMetaData().getColumnCount() +1 ; i++) {
                System.out.printf("%s ",resultSet.getMetaData().getColumnLabel(i));
            }




            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }



//            System.out.println();
//            while(resultSet.next()){
//                    String string = resultSet.getString(3);
//
//                    String string1 = resultSet.getString(1);
//
//                    String string2 = resultSet.getString(2);
//
//
//
//                System.out.printf("%s - %s - %s%n",string1,string2,string);
//
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
