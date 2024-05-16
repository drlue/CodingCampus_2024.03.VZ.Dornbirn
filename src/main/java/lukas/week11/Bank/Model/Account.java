package lukas.week11.Bank.Model;

import java.util.Vector;

public class Account {
    int accountNumber;
    private int balance;
    private Vector<Customer> accountHolders;

    public Account(int accountNumber, int balance, Customer holder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountHolders = new Vector<>();
        accountHolders.add(holder);
    }




}
