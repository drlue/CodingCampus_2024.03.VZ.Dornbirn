package katherina.week11.sqlBank;

import katherina.week11.sqlBank.service.AccountService;
import katherina.week11.sqlBank.struktur.Bank;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("Offizielle Digitale Haus- und Hofbank");
        new AccountService().readAccount(bank);
        bank.printStructure();
    }
}

