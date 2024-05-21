package samet.week12.BankOOP.model;


import java.util.ArrayList;
import java.util.List;

public class Account {

    private int Id;
    private String accountNumber;
    private String accountType;
    private int openingYear;
    private double accountBalance;
    private List<Customer> customerList;
    private List<Account> accountList;


    public Account() {

        this.customerList = new ArrayList<>();
        this.accountList = new ArrayList<>();
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.printf(" Deposited: %.2f on Account %s %n", amount, accountNumber);
        } else {
            System.out.println(" Invalid deposit amount on Account: " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.printf(" Withdrawn: %.2f from Account %s %n", amount, accountNumber);
        } else {
            System.out.println(" Invalid withdrawl amount from Account: " + accountNumber);
        }
    }

    public void printStructure() {
        System.out.printf("|         |---Account: %s | %s| %d | %.2f %n", accountNumber, accountType, openingYear, accountBalance);
    }

    public void addAccount(Account account) {
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }
}

