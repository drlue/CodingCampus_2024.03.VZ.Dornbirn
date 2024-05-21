package ardijanla.PrimiBank.DAOs;

import ardijanla.PrimiBank.models.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private Connection conn;

    public CustomerDAO() {
        this.conn = DBConnection.getConnection();
    }


    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "Select * from Customer";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                Customer customer = new Customer(rs.getInt("idCustomer"), rs.getString("name"), rs.getInt("idbank"));
                customers.add(customer);


            }
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return customers;
    }

    public Customer getCustomerbyId(int id) {

        String sql = "SELECT * FROM Customer WHERE idCustomer = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id); // Set the id parameter
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) { // Check if the result set has any data
                    Customer customer = new Customer(rs.getInt("idCustomer"), rs.getString("name"), rs.getInt("idBank"));
                    return customer;
                } else {
                    return null; // No customer found with the given id
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving customer: " + e.getMessage());
            return null;
        }




    }

    public void addCustomer(Customer customer){


    }
}
