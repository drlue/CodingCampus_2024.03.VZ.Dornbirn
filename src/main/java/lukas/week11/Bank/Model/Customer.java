package lukas.week11.Bank.Model;

import java.util.Vector;

public class Customer {

    int id;
    String firstName;
    String lastName;
    String address;
    Vector<Account> accounts;

    public Customer(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        accounts = new Vector<>();
    }
}
