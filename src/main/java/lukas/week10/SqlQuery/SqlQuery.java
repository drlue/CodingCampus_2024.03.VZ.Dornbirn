package lukas.week10.SqlQuery;

import ardijanla.ConsoleColors;
import lukas.Colors;

import java.sql.*;
import java.text.SimpleDateFormat;

public class SqlQuery {


    public static void main(String[] args) {
        //User Input
        //String myCountry = Helper.readStringFromConsole("Bitte ein Land eingeben:==>");

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;


        try {
            //establish connection to mysql server
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
            //sql query text

//            String sql = "SELECT ci.Name, ci.Province, ci.Population from city as ci " +
//                    "JOIN country as co ON ci.Country = co.code " +
//                    "WHERE co.name = ?";

            String sql = "select * from organization\n" +
                    "left join city ON city.Name = organization.City AND city.country = organization.country";

//            String sql = "select * from sea";

            //prepare and execute SQL statement
            stmt = conn.prepareStatement(sql);
            //stmt.setString(1, myCountry);
            //stmt.setString(1, myCountry);

            rs = stmt.executeQuery();

            //OUTPUT
            printTable(rs);


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


    public static void printTable(ResultSet rs) throws SQLException {
        //Color Definitions
        String headerColors = Colors.hslForeAndBackground(0, 1, 1.0f, 240, 0.059f, 0.333f);
        headerColors = Colors.makeFontBold(headerColors);
        String oddRowColors = Colors.hslForeAndBackground(0, 1, 0.0f, 240, 0.0f, 0.949f);
        String evenRowColors = Colors.hslForeAndBackground(0, 1, 0.0f, 240, 0.0f, 0.910f);
//        String headerColors = Colors.rgbForeAndBackground(255,255,255,80,80,90);
//        String oddRowColors = Colors.rgbForeAndBackground(1,1,1,242,242,242);
//        String evenRowColors = Colors.rgbForeAndBackground(1,1,1,232,232,232);



        ResultSetMetaData metaData = rs.getMetaData();

        int tabWidth = 0;
        //print header
        //Set Backgroundcolors:
        System.out.print(headerColors);

        for (int col = 1; col <= metaData.getColumnCount(); col++) {
            int colSize = Math.max(metaData.getColumnDisplaySize(col), metaData.getColumnLabel(col).length());
            System.out.printf("%-" + colSize + "s | ", metaData.getColumnLabel(col));
            tabWidth += colSize + 3;
        }
        System.out.print(ConsoleColors.RESET);
        System.out.println();

        System.out.print(headerColors);
        System.out.println("-".repeat(tabWidth) + ConsoleColors.RESET);

        //print data rows
        int row = 1;
        while (rs.next()) {

            //alternating background colors per line
            System.out.print(row % 2 == 0 ? evenRowColors : oddRowColors);

            //iterate columns
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                int colSize = Math.max(metaData.getColumnDisplaySize(col), metaData.getColumnLabel(col).length());
                String colType = metaData.getColumnTypeName(col);

                switch (colType) {
                    case "VARCHAR":
                    case "TEXT":
                        System.out.printf("%-" + colSize + "s | ", rs.getString(col));
                        break;
                    case "INT":
                        System.out.printf("%" + colSize + "d | ", rs.getInt(col));
                        break;
                    case "FLOAT":
                        System.out.printf("%" + colSize + ".2f | ", rs.getFloat(col));
                        break;
                    case "DATE":
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                        String formattedDate = rs.getDate(col) != null ? dateFormat.format(rs.getDate(col)) : "null";
                        System.out.printf("%" + colSize + "s | ", formattedDate);
                }
            }

            //Color reset and linebreak
            System.out.print(ConsoleColors.RESET);
            System.out.println();
            row++;
        }

    }


}

