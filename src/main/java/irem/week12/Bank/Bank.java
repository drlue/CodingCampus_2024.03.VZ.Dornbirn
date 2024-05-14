package irem.week12.Bank;

public class Bank {

    private CustomerService customerService;
    private AccountService accountService;

    public Bank() {
        this.customerService = new CustomerService();
        this.accountService = new AccountService();
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public AccountService getAccountService() {
        return accountService;
    }
}
