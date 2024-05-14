package irem.week12.Bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private List<Account> accounts;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
