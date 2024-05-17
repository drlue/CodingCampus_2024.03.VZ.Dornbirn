package luki.week12.db.bank2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseConnectionTest {

    @Test
    public void testOpenSuccess() {
        DatabaseConnection connection = new DatabaseConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
        try {
            connection.open();
        } catch(SQLException exc) {
            Assertions.fail("There should be no exception!");
        }
        Assertions.assertNotNull(connection.getConn(), "The connection was not returned");
    }

    @Test
    public void testOpenFail() {
        DatabaseConnection connection = new DatabaseConnection("jdbc:mysql://asdf:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
        try {
            connection.open();
            Assertions.fail("Connection should not be established!");
        } catch(SQLException exc) {
            //OK
        }
    }

    @Test
    public void testClose() {
        DatabaseConnection connection = new DatabaseConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
        try {
            connection.open();
        } catch (SQLException e) {
            Assertions.fail("Open failed");
        }

        try {
            connection.close();
        } catch (SQLException e) {
            Assertions.fail("Connection could not be closed");
        }

        try {
            connection.getConn();
            Assertions.fail("Connection is still there!");
        } catch(Exception exc) {
            //noop
        }
    }
}
