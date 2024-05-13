package irem.week11;

import java.sql.*;

public class SqlQuerry {

        public static void main(String[] args) {
            String searchText = "%burg";
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?useUnicode=true&characterEncoding=utf8", "irem", "irem");

                PreparedStatement ps = conn.prepareStatement("SELECT * FROM city where name like ?");
                ps.setString(1,  searchText + "%");
                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                    System.out.println(rs.getString("Name"));
                }

                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
