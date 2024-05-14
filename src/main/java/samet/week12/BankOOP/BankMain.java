package samet.week12.BankOOP;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("Blackrock",2019);

        Customer customer = new Customer("Max Mustermann", 45, "Bäumlegasse 14 6973 Höchst");
        Account account = new Account(1546121,2019,5614,94f);

        bank.addCustomer(customer);
        customer.addAccount(account);

        bank.printStructure();
    }




}
