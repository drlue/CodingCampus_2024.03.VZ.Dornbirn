package ardijanla.PrimiBank.services;

import ardijanla.PrimiBank.DAOs.BankDAO;
import ardijanla.PrimiBank.models.Bank;

import java.util.List;

public class BankService {
    private BankDAO bankDAO;

    public BankService() {
        this.bankDAO = new BankDAO(); // BankDAO initialisiert seine eigene Verbindung
    }

    public List<Bank> getAllBanks() {
        return bankDAO.getAllBanks();
    }
}
