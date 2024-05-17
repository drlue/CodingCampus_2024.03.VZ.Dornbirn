package samet.week12.BankOOP.service;

import samet.week12.BankOOP.model.Account;
import samet.week12.BankOOP.model.Bank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService {

    public void readAccountFromDb(Bank bank) {
        Connection conn = DbManager.getInstance().getConn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("select ID, Account_number, Account_type, Account_opened, Account_balance from account");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Account account = new Account();
                    account.setId(rs.getInt("ID"));
                    account.setAccountNumber(rs.getString("Account_number"));
                    account.setAccountType(rs.getString("Account_type"));
                    account.setOpeningYear(rs.getInt("Account_opened"));
                    account.setAccountBalance(rs.getDouble("Account_balance"));
                    bank.addAccount(account);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                try {
                    conn.close();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }
}

