package luki.week12.db.bank2.dao;

import luki.week12.db.bank2.model.Bank;

import java.sql.*;
import java.util.List;
import java.util.Vector;

public class BankService {
    private Connection connection;

    public BankService(Connection connection) {
        this.connection = connection;
    }

    public void addBank(Bank bank) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO bank (name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, bank.getName());
        stmt.execute();
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.first()) {
            bank.setBankID(resultSet.getInt(1));
        }
        resultSet.close();
        stmt.close();
    }

    public List<Bank> getAllBanks() throws SQLException {
        Statement stmt = this.connection.createStatement();
        try {
            stmt.execute("SELECT bankID, name FROM bank");
            ResultSet resultSet = stmt.getResultSet();

            try {
                List<Bank> bankList = new Vector<>();

                while (resultSet.next()) {
                    Bank bank = new Bank(resultSet.getString("name"));
                    bank.setBankID(resultSet.getInt("bankID"));
                    bankList.add(bank);
                }
                return bankList;
            } finally {
                resultSet.close();
            }
        } finally {
            stmt.close();
        }
    }
}
