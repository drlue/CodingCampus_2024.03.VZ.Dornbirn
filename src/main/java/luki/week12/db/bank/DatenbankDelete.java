package luki.week12.db.bank;

import luki.week12.db.bank.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DatenbankDelete {
    public static void main(String[] args) throws SQLException {
        Database database = new Database();

        database.connect();

        Connection connection = database.getConn();

        DatabaseManager manager = new DatabaseManager(connection);

        List<Customer> customers = manager.getCustomers();
        System.out.println("Customers: "+customers.size());

        manager.delete(customers.get(0));
    }
}
