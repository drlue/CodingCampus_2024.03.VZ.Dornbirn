package irem.week12.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {

    public void ReadCustomerFromDB(Bank bank) {

        // customer.setName(newName);
        Connection conn = DBConnection.getInstance().getConn();
        if (conn != null) {
            try {
                PreparedStatement prStmnt = conn.prepareStatement("select customer_id, name, age, addresse from customers;");

                ResultSet rs = prStmnt.executeQuery();
                while (rs.next()) {
                  Customer customer1 = new Customer();

                    customer1.setID(rs.getInt("customer_id"));
                    customer1.setName(rs.getString("name"));
                    customer1.setAge(rs.getInt("age"));
                    customer1.setAddress(rs.getString("addresse"));
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


//
//    public void updateCustomer(String newName, Customer cutomer){
//
//        cutomer.setName(newName);
//        Connection conn = DBConnection.getConn().isInstance();
//        if(conn != null){
//            try{
//                PreparedStatement prStmnt = conn.prepareStatement("select customer_id name, age, addres");
//                ResultSet rs= prStmnt.executeQuery();
//                while (rs.next()){
//                    Customer customer1 = new Customer();
//                    customer1.setID(rs.getInt("customer_id"));
//                    customer1.setName(rs.getString("name"));
//                    customer1.setAge(rs.getInt("age"));
//                    customer1.setaddress(rs.getString("addres"));
//                    bank.addcustomer(customer1);
//                }
//                rs.close();
//                prStmnt.close();
//            }catch (SQLException sqle){
//                try{
//                    conn.close();
//                }catch(SQLException e){
//            }
//        }
//            conn
//    }
//}

//    private Map<Integer, Customer> customers;
//
//    public CustomerService() {
//        this.customers = new HashMap<>();
//    }
//
//    public void addCustomer(Customer customer) {
//        customers.put(customer.getCustomerId(), customer);
//        // SQL-Befehl eingefügt den Kunden in einer Datenbank zu speichern.
//    }
//
//    public Customer getCustomer(int customerId) {
//        // SQL-Befehl um den Kunden aus der Datenbank abzurufen.
//        return customers.get(customerId);
//    }
//}
