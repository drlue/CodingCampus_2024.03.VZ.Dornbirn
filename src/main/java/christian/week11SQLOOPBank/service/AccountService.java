package christian.week11SQLOOPBank.service;

import christian.week11SQLOOPBank.Banksystem;
import christian.week11SQLOOPBank.dao.AccountDAO;
import christian.week11SQLOOPBank.model.Account;
import christian.week11SQLOOPBank.model.Bank;

import java.util.List;

public class AccountService {

    private AccountDAO accountDAO;

    public AccountService() {
        accountDAO = new AccountDAO();
    }

    public void addAccoutListToModel() {
        List<Account> listOfAccounts = accountDAO.readAllAccountsFromDB();
        Bank bank = Banksystem.getBankByID(1);
        for (Account acc : listOfAccounts) {
            bank.addAccToList(acc);
        }
    }
}
