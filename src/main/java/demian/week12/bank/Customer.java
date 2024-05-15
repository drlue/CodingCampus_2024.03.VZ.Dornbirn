package demian.week12.bank;

import java.util.Vector;

public class Customer {

    private Vector<Account> accountList;

    public Customer() {
        this.accountList = new Vector<>();
    }

    public void addAccount(Account accountNummer) {
        accountList.add(accountNummer);
    }
}
