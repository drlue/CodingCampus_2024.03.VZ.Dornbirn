package katherina.week11.sqlBank.service;

import katherina.week11.sqlBank.struktur.Account;
import katherina.week11.sqlBank.struktur.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService {

    public void readAccount(Bank bank) {
            Connection conn = DatabaseManager.getInstance().getConnection();
            if (conn != null) {
                try {
                    PreparedStatement ps = conn.prepareStatement("select ID, balance");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        Account account = new Account();
                        account.setId(rs.getInt("ID"));
                        account.setBalance(rs.getFloat("balance"));
                        bank.addAccount(account);
                    }
                    rs.close();
                    ps.close();
                } catch (SQLException sqle) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                    }
                    conn = null;
                }
            }
        }
}
