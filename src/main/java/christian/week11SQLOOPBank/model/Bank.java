package christian.week11SQLOOPBank.model;

import java.util.ArrayList;

public class Bank {
    private int id;
    private String name;
    private int established;
    private float assets;
    private ArrayList<Customer> listOfCustomers;
    private ArrayList<Account> listOfAccounts;

    public Bank(int id, String name, int established, float assets) {
        this.id = id;
        this.name = name;
        this.established = established;
        this.assets = assets;
        listOfAccounts = new ArrayList<>();
        listOfCustomers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addAccToList(Account account) {
        if (!listOfAccounts.contains(account)) {
            listOfAccounts.add(account);
        }
    }

    public void addCustToList(Customer customer) {
        if (!listOfCustomers.contains(customer)) {
            listOfCustomers.add(customer);
        }
    }
    public Account getAccountByID(int id){
        for(Account acc:listOfAccounts){
            if(acc.getAccount_ID() == id){
                return acc;
            }
        }
        return null;
    }
}
