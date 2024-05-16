package samet.week12.BankOOP;

import samet.week12.BankOOP.model.Bank;
import samet.week12.BankOOP.service.CustomerService;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(" Blackrock", 2019);

        new CustomerService().readCustomersFromDB(bank);
        
/*
        Account account = new Account("123456789", "Privat", 2019, 4500.54);
        Account account2 = new Account("46576761235", "Business", 2021, 45356.8);

        //customer.addAccount(account);
        //customer.addAccount(account2);

        Customer customer1 = new Customer("Johann Strauß", 25, "Bahnhofstraße 1 6900 Bregenz");
        Account account1 = new Account("423463223", "Business", 2020, 1000000);
        Account account3 = new Account("423412234554", "Private", 2022, 8986.95);
        bank.addCustomer(customer1);
        customer1.addAccount(account1);
        customer1.addAccount(account3);

        Customer customer2 = new Customer("Mozart Amadeus", 54, "Paradiesgasse 5 6890 Lustenau");
        bank.addCustomer(customer2);
        customer1.withdraw(account1, 1000400);
        customer.deposit(account, 500);
*/

        bank.printStructure();
    }


}
