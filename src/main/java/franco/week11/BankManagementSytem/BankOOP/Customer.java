package franco.week11.BankManagementSytem.BankOOP;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    private List<Account> accountList;


    public Customer() {

    }

    public Customer(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.accountList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }


    public void printStructure() {
        System.out.printf("|    |--- Customer: %s %s %s %n", name, age, address);
        if (accountList == null) {
            System.out.println("No account yet");
        } else {
            for (Account account : accountList)

                account.printStructure();
        }
    }
}

