package lukas.week11.Bank.Model;

import java.util.Vector;

public class Bank {

    int bic;
    String name;

    Vector<Account> accounts;
    Vector<Customer> customers;

    public Bank (int bic, String name){
        this.bic = bic;
        this.name = name;
        accounts = new Vector<>();
        customers = new Vector<>();
    }



}
