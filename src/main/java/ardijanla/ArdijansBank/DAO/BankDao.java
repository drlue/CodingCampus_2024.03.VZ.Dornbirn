package ardijanla.ArdijansBank.DAO;

import ardijanla.ArdijansBank.models.Bank;

import java.util.List;

public interface BankDao {

    void addBank(Bank bank);
    Bank getBank(int id);
    List<Bank> getAllBanks();
    void updateBank(Bank bank);
    void deleteBank(int id);

}
