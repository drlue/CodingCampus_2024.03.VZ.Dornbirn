package luki.week12.db.bank;

import luki.week12.db.bank.model.Account;
import luki.week12.db.bank.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;

public class DatenbankTest {
    public static void main(String[] args) throws SQLException {
        Database database = new Database();

        database.connect();

        Connection connection = database.getConn();



        DatabaseManager manager = new DatabaseManager(connection);

        System.out.println(manager.createCustomer("Sandroid"));

        System.out.println(manager.getCustomers());

        for(Customer c : manager.getCustomers()) {
            c.setName(c.getName()+"1");
            manager.updateCustomer(c);
            System.out.println(c.getName());
        }


        //Kunde kommt in die Bank
        Customer kurt = manager.createCustomer("Kurt");

        //Kurt möchte 3 konten
        Account account = manager.createAccount();
        manager.connect(kurt, account, "Besitzer");

        account = manager.createAccount();
        manager.connect(kurt, account, "Pate");

        account = manager.createAccount();
        manager.connect(kurt, account, "Zeichnungsberechtigt");

        for(Customer c : manager.getCustomers()) {
            System.out.println(c);
        }

//        System.out.println(stmt.getGeneratedKeys().getLong(1));

        database.disconnect();
    }
}
