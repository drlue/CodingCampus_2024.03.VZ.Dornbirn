package irem.week12.Bank;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private Map<Integer, Account> accounts;

    public AccountService() {
        this.accounts = new HashMap<>();
    }

    public void openAccount(Account account) {
        accounts.put(account.getAccountId(), account);
        // SQL-Befehl um das Konto in der Datenbank zu speichern.
    }

    public Account getAccount(int accountId) {
        // SQL-Befehl um das Konto aus der Datenbank abzurufen.
        return accounts.get(accountId);
    }

    public void closeAccount(int accountId) {
        accounts.remove(accountId);
        // SQL-Befehl um das Konto in der Datenbank zu löschen.
    }
}
