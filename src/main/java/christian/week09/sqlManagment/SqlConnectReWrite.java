package christian.week09.sqlManagment;

import java.sql.*;

public class SqlConnectReWrite {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep =  null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial","root","Zmamk_243567");
            prep = conn.prepareStatement("Select country.name as name, country.population as pop from country where name like ?;") ;
            prep.setString(1,"a%a");
            ResultSetMetaData metaData = prep.getMetaData();
            rs = prep.executeQuery();
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.printf("| %-19s ",metaData.getColumnLabel(col));
            }
            System.out.println();
            while(rs.next()){
                System.out.printf("| %-19s | %-19d \n",rs.getString(1),rs.getInt(2));
            }
        } catch (SQLException sqlex){
            sqlex.printStackTrace();
        }

    }
}
