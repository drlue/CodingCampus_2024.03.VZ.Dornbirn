package luki.week12.db.bank2.dao;

import luki.week12.db.bank2.DatabaseConnection;
import luki.week12.db.bank2.model.Bank;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BankServiceTest {
    private BankService service;
    private DatabaseConnection databaseConnection;

    @BeforeEach
    public void setup() throws SQLException {
        databaseConnection = new DatabaseConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
        databaseConnection.open();
        service = new BankService(databaseConnection.getConn());

        PreparedStatement statement = databaseConnection.getConn().prepareStatement("TRUNCATE bank");
        statement.execute();
        statement.close();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        databaseConnection.close();
    }

    @Test
    public void addBankTest() {
        Bank bank = new Bank("Blackrock");
        try {
            service.addBank(bank);
        } catch (SQLException e) {
            Assertions.fail("Exception occured!!!");
        }
        Assertions.assertTrue(bank.getBankID() != 0, "Bank id is 0");

        bank = new Bank("");
        try {
            service.addBank(bank);
        } catch (SQLException e) {
            Assertions.fail("Exception occured!!!");
        }
        Assertions.assertTrue(bank.getBankID() != 0, "Bank id is 0");
    }

    @Test
    public void getAllBanksTest() {
        for (int i = 0; i < 100; i++) {
            try {
                service.addBank(new Bank("BlackRocK" + i));
            } catch (SQLException e) {
                Assertions.fail("Bank could not be inserted");
            }
        }

        try {
            List<Bank> bankList = service.getAllBanks();
            Assertions.assertEquals(100, bankList.size(), "Bank count is not correct");
        } catch (Exception exc) {
            Assertions.fail("Retrieving all banks failed");
        }
    }

    @Test
    public void transactionTest() throws SQLException {
        Connection connection = databaseConnection.getConn();
        System.out.println(connection.getTransactionIsolation());
        try {
            connection.setAutoCommit(false);
            try {
                for (int i = 0; i < 100; i++) {
                    if (Math.random() > 0.95) {
                        service.addBank(new Bank("BlackRocK".repeat(100)));
                    } else {
                        service.addBank(new Bank("BlackRocK" + i));
                    }
                }
            } catch (SQLException exc) {
                connection.rollback();
                Assertions.fail("That failed");
            }
            connection.commit();
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Test
    public void findByIdTest() {
        for (int i = 0; i < 100; i++) {
            try {
                service.addBank(new Bank("BlackRocK" + i));
            } catch (SQLException e) {
                Assertions.fail("Bank could not be inserted");
            }
        }

        Bank bank = null;
        try {
            bank = service.findById(10);
        } catch (SQLException e) {
            Assertions.fail("Bank with id 10 could not be found!", e);
        }
        Assertions.assertNotNull(bank, "Bank should not be null!");
        Assertions.assertEquals("BlackRocK9", bank.getName());
    }

    @Test
    public void updateTest() throws SQLException {
        //Create one bank
        Bank b = new Bank("Blackrock");
        service.addBank(b);

        Assertions.assertEquals("Blackrock", service.findById(b.getBankID()).getName());

        //Retrieve bank
        Bank bank = service.findById(b.getBankID());
        bank.setName("ÖkoFairBank");
        //Update it
        int affectedRows = service.update(bank);
        Assertions.assertEquals(1, affectedRows);

        Assertions.assertEquals("ÖkoFairBank", service.findById(bank.getBankID()).getName());

    }
}
