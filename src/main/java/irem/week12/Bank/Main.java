package irem.week12.Bank;
;

public class Main {

    public static void main(String[] args) {

      Bank bank = new Bank(" The One Piece Bank", 1978);
        new CustomerService().ReadCustomerFromDB(bank);

        bank.printStructure();
    }

}
//        Bank bank = new Bank();
//
//        CustomerService customerService = bank.getCustomerService();
//        AccountService accountService = bank.getAccountService();
//
//        Customer customer = new Customer(1, "Golden Rogger", "Piecestreet");
//        Account account = new Account(1001);
//        customer.addAccount(account);
//
//        customerService.addCustomer(customer);
//        accountService.openAccount(account);
//
//        // Einzahlung und Auszahlung
//        account.deposit(800);
//        account.withdraw(500);
//
//        System.out.println("Kontostand: " + account.getBalance());
//    }
//}