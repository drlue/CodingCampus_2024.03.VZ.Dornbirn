package lukas.week10.SqlAndOop;

import java.sql.*;

public class DbFunctions {

    public static ResultSet getRsFromDb(String sql) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
        ) {

            return rs;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
