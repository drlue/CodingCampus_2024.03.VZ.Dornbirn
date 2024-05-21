package luki.week12.db.bank2;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection tester = new DatabaseConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");

        tester.getConn();
    }
}
