package samet.week12.BankOOP.model;


import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String accountType;
    private int openingYear;
    private double accountBalance;
    private List<Customer> customerList;


    public Account() {

        this.customerList = new ArrayList<>();
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
}
