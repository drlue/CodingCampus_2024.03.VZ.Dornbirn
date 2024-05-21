package christian.week11SQLOOPBank.dao;

import christian.week11SQLOOPBank.Banksystem;
import christian.week11SQLOOPBank.model.Account;
import christian.week11SQLOOPBank.model.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AccountDAO {
    private Connection conn;

    public AccountDAO() {
        this.conn = ConnectionManagar.getConnection();
    }

    public List<Account> readAllAccountsFromDB() {
        List<Account> accountList = new ArrayList<>();
        String query = "Select * from account";
        try (PreparedStatement prep = conn.prepareStatement(query);
             ResultSet rs = prep.executeQuery()) {

            while (rs.next()) {
                Account acc = new Account(
                        rs.getInt("account_id"),
                        rs.getInt("assets")
                        );
                accountList.add(acc);
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
        return accountList;
    }
    public void updateAssets(int assets,int id){

        String query = "UPDATE account set assets = ? where account_id = ?";
        try (PreparedStatement prep = conn.prepareStatement(query)) {
            prep.setInt(1,assets);
            prep.setInt(2,id);
            prep.execute();
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

    }

}
