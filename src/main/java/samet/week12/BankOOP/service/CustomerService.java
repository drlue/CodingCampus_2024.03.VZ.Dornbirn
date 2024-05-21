package samet.week12.BankOOP.service;

import samet.week12.BankOOP.model.Account;
import samet.week12.BankOOP.model.Bank;
import samet.week12.BankOOP.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {


    public void readCustomersFromDB(Bank bank) {
        Connection conn = DbManager.getInstance().getConn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("select ID, Customer_name, Customer_age, Customer_address from customer");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setIdCustomer(rs.getInt("ID"));
                    customer.setName(rs.getString("Customer_name"));
                    customer.setAge(rs.getInt("Customer_age"));
                    customer.setAddress(rs.getString("Customer_address"));
                    bank.addCustomer(customer);
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


