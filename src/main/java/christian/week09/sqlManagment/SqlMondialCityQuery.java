package christian.week09.sqlManagment;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SqlMondialCityQuery {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;

//        System.out.println("Bitte gib ein Land ein:");
//        String insert = sc.nextLine();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?user=root&password=Zmamk_243567");
            //prep = conn.prepareStatement("Select city.name,city.province as Bundesland,city.population as Einwohner from City join country on city.country = country.code where country.name like ?");
            //prep.setString(1, insert);
            prep = conn.prepareStatement("select country.name Land, Population, Sea.Name Sea, max(Depth) depth \n" +
                    "from country\n" +
                    "left join geo_sea on geo_sea.country = country.code\n" +
                    "left join sea on sea.name = geo_sea.sea\n" +
                    "group by country.name, Population, Sea.name");
            rs = prep.executeQuery();

            printResultSet(rs);

        } catch (SQLException sex) {
            sex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (prep != null) {
                    prep.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException sex) {
                sex.printStackTrace();
            }
        }

    }

    public static void printResultSet(ResultSet rs) {


        try {
            ResultSetMetaData metaData = rs.getMetaData();

            ArrayList<String> typeOfCol = new ArrayList<>();
            ArrayList<Integer> optimalLengthOfCol = new ArrayList<>();
            typeOfCol.add("Start");
            optimalLengthOfCol.add(0);


            for (int col = 1; col <= metaData.getColumnCount(); col++) {

                typeOfCol.add(metaData.getColumnTypeName(col));

                int optimalLength =  metaData.getPrecision(col);
                optimalLengthOfCol.add(Math.max(optimalLength,metaData.getColumnLabel(col).length()));
                if(metaData.getColumnTypeName(col).equalsIgnoreCase("VARCHAR")){
                    System.out.printf("| %-" + optimalLengthOfCol.get(col) + "s ", metaData.getColumnLabel(col));
                } else {
                    System.out.printf("| %" + optimalLengthOfCol.get(col) + "s ", metaData.getColumnLabel(col));
                }

            }
            System.out.println();
            while (rs.next()) {
                for (int col = 1; col <= metaData.getColumnCount(); col++) {
                    switch(typeOfCol.get(col)){
                        case "VARCHAR" :
                            System.out.printf("| %-"+optimalLengthOfCol.get(col)+"s ", rs.getString(col));
                            break;
                        case "INT" :
                            System.out.printf("| %"+optimalLengthOfCol.get(col)+"d ", rs.getInt(col));
                            break;
                        case "FLOAT" :
                            System.out.printf("| %"+optimalLengthOfCol.get(col)+".2f ", rs.getFloat(col));
                            break;
                        default :
                            System.out.print("error");

                    }
                }
                System.out.println();
            }
        } catch (SQLException sex) {
            sex.printStackTrace();
        }


    }


}
