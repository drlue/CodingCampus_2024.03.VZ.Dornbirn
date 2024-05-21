package samet.week12.BankOOP.model;

import samet.week12.BankOOP.model.Account;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int idCustomer;
    private String name;
    private int age;
    private String address;
    private List<Account> accountList;


    public Customer() {


        this.accountList = new ArrayList<>();

    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public void addAccount(Account account) {
//        if (!accountList.contains(account)) {
//            accountList.add(account);
//        }
//    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }


    public void printStructure() {
        System.out.printf("|    |--- Customer: %s %s %s %n", name, age, address);
        for (Account account : accountList) {
            account.printStructure();
        }
    }
}
