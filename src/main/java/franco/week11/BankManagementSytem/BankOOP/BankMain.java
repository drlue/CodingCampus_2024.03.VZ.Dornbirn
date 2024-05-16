package franco.week11.BankManagementSytem.BankOOP;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(" Everybody Bank", 2019);
        new CustomerService().updateCustomer(bank);
/*
        Customer customer = new Customer("Chung lee", 22, "Mariahilf 14 6900 Bregenz");
        Account account = new Account("123456789", "Privat", 2015, 4500.54);
        customer.addAccount(account);
        Customer customer1 = new Customer("Bobby Lee", 21, "Bahnhofstraße 1 6900 Bregenz");
        Account account1 = new Account("423463223", "Business", 2020, 1000000);
        bank.addCustomer(customer1);
        customer1.addAccount(account1);
        Customer customer2 = new Customer(" Aidarus Wolfgang", 44, "Paradiesgasse 5 6890 Lustenau");
        bank.addCustomer(customer2);
  */
        bank.printStructure();
    }


}
