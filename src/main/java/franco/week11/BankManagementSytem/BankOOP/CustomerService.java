package franco.week11.BankManagementSytem.BankOOP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {
    public void updateCustomer(Bank bank) {

        // customer.setName(newName);
        Connection conn = DbManager.getInstance().getConn();
        if (conn != null) {
            try {
                PreparedStatement prStmnt = conn.prepareStatement("select customer_id,name, age, adress from customers;");

                ResultSet rs = prStmnt.executeQuery();
                while (rs.next()) {
                    Customer customer1 = new Customer();
                    //Brauchen wir
                    customer1.setID(rs.getInt("customer_id"));
                    customer1.setName(rs.getString("name"));
                    customer1.setAge(rs.getInt("age"));
                    customer1.setAddress(rs.getString("adress"));
                    bank.addCustomer(customer1);
                }
                rs.close();
                prStmnt.close();
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
