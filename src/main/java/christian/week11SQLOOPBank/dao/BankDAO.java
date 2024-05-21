package christian.week11SQLOOPBank.dao;

import christian.week11SQLOOPBank.model.Bank;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BankDAO {

    private Connection conn;

    public BankDAO() {
        this.conn = ConnectionManagar.getConnection();
    }

    public List<Bank> readAllBanksFromDB() {
        List<Bank> bankList = new ArrayList<>();
        String query = "Select * from Bank";
        try (PreparedStatement prep = conn.prepareStatement(query);
             ResultSet rs = prep.executeQuery()) {

            while (rs.next()) {
                Bank bank = new Bank(
                        rs.getInt("Bank_Id"),
                        rs.getString("name"),
                        rs.getInt("established"),
                        rs.getInt("assets")
                );
                bankList.add(bank);
            }

        } catch (SQLException sex) {
            sex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sex) {
                sex.printStackTrace();
            }
        }
        return bankList;
    }
}
