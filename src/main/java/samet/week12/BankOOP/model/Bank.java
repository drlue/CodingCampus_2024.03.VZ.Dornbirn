package samet.week12.BankOOP.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private int opening;
    private List<Customer> customerList;
    private List<Account> accountList;


    public Bank(String name, int opening) {

        this.name = name;
        this.opening = opening;
        this.customerList = new ArrayList<>();
        this.accountList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (!customerList.contains(customer)) {
            customerList.add(customer);
        }
    }

    public void printStructure() {
        System.out.println("|--- Bank:" + name + ", established " + opening);
        for (Customer customer : customerList) {
            customer.printStructure();
        }
        for (Account account : accountList){
            account.printStructure();
        }
    }

    public void addAccount(Account account) {
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }
}
