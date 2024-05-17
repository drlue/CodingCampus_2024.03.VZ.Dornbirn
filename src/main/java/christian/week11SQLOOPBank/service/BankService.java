package christian.week11SQLOOPBank.service;

import christian.week11SQLOOPBank.Banksystem;
import christian.week11SQLOOPBank.dao.BankDAO;
import christian.week11SQLOOPBank.model.Bank;

import java.util.List;

public class BankService {

    private BankDAO bankDAO;

    public BankService() {
        bankDAO = new BankDAO();
    }

    public void addBankListToModel() {

        List<Bank> listOfBank = bankDAO.readAllBanksFromDB();
        for (Bank bank : listOfBank) {
            Banksystem.addBankToList(bank);
        }
    }
}
