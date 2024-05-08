package lukas.week10.SqlQuery;

import ardijanla.ConsoleColors;
import lukas.Helper;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class SqlQuery {


    public static void main(String[] args) {

        //User Input
        //String myCountry = Helper.readStringFromConsole("Bitte ein Land eingeben:==>");


        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;


        // String myCountry = "Austria";

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
        String headerBackground = "";
        String headerForeground = "";
        String oddRowBackground = "";
        String oddRowForeground = "";
        String evenRowBackground = "";
        String evenRowForeground = "";


        ResultSetMetaData metaData = rs.getMetaData();
        int tabWidth = 0;
        //print header
        //Set Backgroundcolors:

        System.out.print("\033[38;2;10;10;10;48;2;137;143;153m");
        for (int col = 1; col <= metaData.getColumnCount(); col++) {
            int colSize = Math.max(metaData.getColumnDisplaySize(col), metaData.getColumnLabel(col).length());
            System.out.printf("%-" + colSize + "s | ", metaData.getColumnLabel(col));
            tabWidth += metaData.getColumnDisplaySize(col) + 3;
        }
        System.out.print(ConsoleColors.RESET);
        System.out.println();

        System.out.print("\033[38;2;10;10;10;48;2;137;143;153m");
        System.out.println("-".repeat(tabWidth) + ConsoleColors.RESET);

        //print data rows
        int row = 1;
        while (rs.next()) {

            //alternating background colors per line
            System.out.print(row % 2 == 0 ? "\033[38;2;10;10;10;48;2;237;243;253m" : "\033[38;2;10;10;10;48;2;187;193;203m");

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



    public static String convertRgbToAnsiForeground(int[] rgb) {
        return "\\033[38;2;rgb[0];rgb[1];rgb[2]m";
    }

    public static String convertRgbToAnsiBackground(int[] rgb) {
        return "\\033[48;2;rgb[0];rgb[1];rgb[2]m";
    }

    public static String convertRgbToAnsiForeground(int r, int g, int b) {
        int[] rgb = new int[]{r,g,b};
        return convertRgbToAnsiForeground(rgb);
    }

    public static String convertRgbToAnsiBackground(int r, int g, int b) {
        int[] rgb = new int[]{r,g,b};
        return convertRgbToAnsiBackground(rgb);
    }

    public static String convertRgbToAnsiBackgroundAndForeground(int[] foregroundRgb, int[] backgroundRgb) {
        return "\\033[38;2;foregroundRgb[0];foregroundRgb[1];foregroundRgb[2];48;2;backgroundRgb[0];backgroundRgb[1];backgroundRgb[2]m";
    }


    public static String convertHslToAnsiForeground(int h, float s, float l) {
        int[] foregroundRgb = convertHslToRgb(h, s, l);
        return "\\033[38;2;foregroundRgb[0];foregroundRgb[1];foregroundRgb[2]m";
    }

    public static String convertHslToAnsiBackground(int h, float s, float l) {
        int[] backgroundRgb = convertHslToRgb(h, s, l);
        return "\\033[48;2;backgroundRgb[0];backgroundRgb[1];backgroundRgb[2]m";
    }

    public static String convertHslToAnsiBackgroundAndForeground(int hFore, float sFore, float lFore,int hBack, float sBack, float lBack) {
        int[] foregroundRgb = convertHslToRgb(hFore, sFore, lFore);
        int[] backgroundRgb = convertHslToRgb(hBack, sBack, lBack);
        return "\\033[38;2;foregroundRgb[0];foregroundRgb[1];foregroundRgb[2];48;2;backgroundRgb[0];backgroundRgb[1];backgroundRgb[2]m";
    }

    public static int[] convertHslToRgb(int h, float s, float l) {
        //convert hsl to rgb
        float r, g, b;

        if (s == 0) { //achromatic
            r = l;
            g = l;
            b = l;
        } else {
            float q = l < 0.5 ? l * (1 + s) : l + s - l * s;
            float p = 2 * l - q;
            r = hueToRgb(p, q, h + 1f/3f);
            g = hueToRgb(p, q, h);
            b = hueToRgb(p, q, h - 1f/3f);

        }
        //int[] rgb = {Math.round(r*255), Math.round(g*255), Math.round(b*255)};
        int[] rgb = {to255(r), to255(g), to255(b)};
        return rgb;
    }

    public static int to255(float v) { return (int)Math.min(255,256*v); }
    public static float hueToRgb(float p, float q, float t){
        if(t < 0) {
            t += 1;
        }else if(t > 1) {
            t -= 1;
        }else if(t < (1f/6f)) {
            return p + (q - p) * 6f * t;
        }
        if (t < 1f/2f)
            return q;
        if (t < 2f/3f)
            return p + (q - p) * (2f/3f - t) * 6f;
        return p;
    }


}

