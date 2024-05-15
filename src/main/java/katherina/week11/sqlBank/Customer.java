package katherina.week11.sqlBank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int iD;
    private String name;
    private String surname;
    private float balance;
    private List<Customer> customerList;

    public Customer(){}

    public Customer(String name, String surname,float balance){
        this.name=name;
        this.surname=surname;
        this.balance=balance;
        this.customerList=new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        if (!customerList.contains(customer)){
            customerList.add(customer);
        }
    }

//    public void create(Customer customer) throws SQLException {
//        try (
//                Connection connection = dataSource.getConnection();
//                PreparedStatement statement = connection.prepareStatement(SQL_INSERT,
//                        Statement.RETURN_GENERATED_KEYS);
//        ) {
//
//            statement.setString(1, String.valueOf(customer.getId()));
//            statement.setString(2, customer.getName());
//            statement.setString(3, customer.getSurname());
//            statement.setString(4, String.valueOf(customer.getBalance()));
//
//            int affectedRows = statement.executeUpdate();
//
//            if (affectedRows == 0) {
//                throw new SQLException("Creating user failed, no rows affected.");
//            }
//
//            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
//                if (generatedKeys.next()) {
//                    customer.setId(generatedKeys.getLong(1));
//                }
//                else {
//                    throw new SQLException("Creating user failed, no ID obtained.");
//                }
//            }
//        }
//    }

    private float getBalance() {
        return balance;
    }

    private int getId() {
        return iD;
    }

    private String getSurname() {
        return surname;
    }

    private String getName() {
        return name;
    }

    private void setId(long aLong) {
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
