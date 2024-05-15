package samet.week12.BankOOP;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int age;
    private String address;
    private List<Account> accountList;


    public Customer(String name, int age, String address){

        this.name = name;
        this.age = age;
        this.address = address;
        this.accountList = new ArrayList<>();

    }

    public void addAccount(Account account){
        if (!accountList.contains(account)){
            accountList.add(account);
        }
    }
    public void deposit(Account account, double amount){
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount){
        account.withdraw(amount);
    }




    public void printStructure(){
        System.out.printf("|    |--- Customer: %s %s %s %n" ,name, age, address);
        for (Account account : accountList){
            account.printStructure();
        }
    }
}