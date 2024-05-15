package samet.week12.BankOOP;



import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String accountType;
    private int openingYear;
    private double accountBalance;
    private List<Customer> customerList;



    public Account(String accountNumber, String accountType, int openingYear, double accountBalance){

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.openingYear = openingYear;
        this.accountBalance = accountBalance;
        this.customerList = new ArrayList<>();
    }

    public void deposit(double amount){
        if (amount > 0){
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawl amount.");
        }
    }

    public void printStructure(){
        System.out.printf("|         |---Account: %s | %s| %d | %.2f %n" ,accountNumber, accountType, openingYear, accountBalance);

    }
}
