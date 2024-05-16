package christian.week11SQLOOPBank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int customer_Id;
    private String name;
    private List<Account> listOfAccounts;

    public Customer(String name) {
        this.name = name;
        listOfAccounts = new ArrayList<>();
    }

    public void addAccToList(Account account) {
        if (!listOfAccounts.contains(account)) {
            listOfAccounts.add(account);
        }
    }
}
