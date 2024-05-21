package ardijanla.week11;

import franco.week02.day05.Array;

import java.rmi.MarshalException;
import java.sql.*;
import java.util.Vector;

public class SqlTesting {

    public static void main(String[] args) {


        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "root");
                Statement stmt = conn.createStatement();

        ) {
            String querySelect = "select * from Country";
            ResultSet rset = stmt.executeQuery(querySelect);


            int[] inlist = new int[rset.getMetaData().getColumnCount()];
            for (int i = 1; i < rset.getMetaData().getColumnCount() + 1; i++) {
                int getColumWidth = rset.getMetaData().getColumnDisplaySize(i);
                inlist[i - 1] = getColumWidth;

                System.out.printf("%-" + getColumWidth + "s|", rset.getMetaData().getColumnName(i));
            }


            System.out.println();

            while (rset.next()) {
                String name = rset.getString(1);
                String code = rset.getString(2);
                String capital = rset.getString(3);
                String province = rset.getString(4);
                float area = rset.getFloat(5);
                int population = rset.getInt(6);

                System.out.printf("%-" + inlist[0] + "s ",name);
                System.out.printf("%-" + inlist[1] + "s ",code);
                System.out.printf("%-" + inlist[2] + "s ",capital);
                System.out.printf("%-" + inlist[3] + "s ",province);
                System.out.printf("%-" + inlist[4] + ".3f ",area);
                System.out.printf("%-" + inlist[5] + "d %n",population);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
