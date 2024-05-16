package ardijanla.PrimiBank.DAOs;

import ardijanla.PrimiBank.models.Bank;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {
    private Connection conn;

    public BankDAO() {
        this.conn = DBConnection.getConnection();
    }

    public List<Bank> getAllBanks() {
        List<Bank> banks = new ArrayList<>();
        String sql = "SELECT idbank, name, location FROM Bank";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Bank bank = new Bank(rs.getInt("idbank"), rs.getString("name"), rs.getString("location"));
                banks.add(bank);
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Abrufen der Banken: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Fehler beim Schließen der Datenbankverbindung: " + ex.getMessage());
            }
        }
        return banks;
    }


}
