package christian.week09.sqlManagment;

import java.sql.*;

public class SqlConnect {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;


        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=Zmamk_243567");
            prepstmt = conn.prepareStatement("select * from river " +
                    "join geo_river on river.name = geo_river.river " +
                    "join country on country.code = geo_river.country " +
                    "where country.name = ?;");
            prepstmt.setString(1,"germany");
            rs = prepstmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnName(col));
                System.out.println(metaData.getColumnLabel(col));
            }
            boolean first= false;
            while(rs.next()){
//                System.out.println(rs.getString(1));
//                System.out.println(rs.getString(2));
                if(first==false){
                    System.out.printf("  Name    |   River    |\n");
                    first=true;
                }
                System.out.printf("  %-8s|   %-8s\n", rs.getString(1),rs.getString(2));

            }
        } catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } finally {
            try{
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException sqlexe) {
                sqlexe.printStackTrace();
            }
            try{
                if(prepstmt!=null){
                    prepstmt.close();
                }
            } catch (SQLException sqlexe) {
                sqlexe.printStackTrace();
            }
            try{
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException sqlexe) {
                sqlexe.printStackTrace();
            }
        }
    }
}
