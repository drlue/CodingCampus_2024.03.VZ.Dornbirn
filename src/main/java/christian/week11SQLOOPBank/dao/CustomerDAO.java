package christian.week11SQLOOPBank.dao;

import christian.week11SQLOOPBank.model.Account;
import christian.week11SQLOOPBank.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private Connection conn;

    public CustomerDAO() {
        this.conn = ConnectionManagar.getConnection();
    }

    public List<Customer> readAllCustomersFromDB() {
        List<Customer> customerList = new ArrayList<>();
        String query = "Select * from Customer";
        try (PreparedStatement prep = conn.prepareStatement(query);
             ResultSet rs = prep.executeQuery()) {

            while (rs.next()) {
                Customer cust = new Customer(
                        rs.getString("name")
                );
                customerList.add(cust);
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
        return customerList;
    }
}
