package katherina.week11.sqlBank.struktur;

import java.util.Vector;

public class Bank {
    private String name;
    private Vector<Customer> customerVector;
    private Vector<Account> accountVector;

    public Bank(String name) {
        this.name = name;
        this.customerVector = new Vector<>();
        this.accountVector = new Vector<>();
    }

    public Account getAccountById(int id) {
        for (Account account : accountVector) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        if (!customerVector.contains(customer)) {
            customerVector.add(customer);
        }
    }

    public void addAccount(Account account) {
        if (!accountVector.contains(account)) {
            accountVector.add(account);
        }
    }

    public void removeAccount(Account account) {
        accountVector.remove(account);
    }

    public void printStructure() {
        System.out.printf("Herzlich Willkommen bei Ihrer Bank:  %s%n", name);
        for (Account account : accountVector) {
            account.printStructure();
        }
    }

//Berechtigungen ändern Kunden-Konto
//Ein- und auszahlen
//
//Customerservice
}
