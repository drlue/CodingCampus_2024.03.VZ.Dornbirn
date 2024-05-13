package lukas.week10.SqlAndOopV1;

import java.sql.*;

public class DbFunctions {

    public static ResultSet getRsFromDb(String sql) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet getRsFromDb(String sql, String ... searchString) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
            PreparedStatement stmt = conn.prepareStatement(sql);

            for (int i = 0; i < countQuestionMarks(sql); i++) {
                stmt.setString(i+1,searchString[i] );
            }

            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private static int countQuestionMarks(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if (c == '?'){
                count++;
            }
        }
        return  count;
    }


}
