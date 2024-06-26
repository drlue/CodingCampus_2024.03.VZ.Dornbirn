package christian.week11SQLOOPBank.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int account_ID;
    private int assets;
    private List<Customer> listOfCustomers;

    public Account(int account_ID, int assets) {
        this.account_ID = account_ID;
        this.assets = assets;
        listOfCustomers = new ArrayList<>();
    }

    public int getAccount_ID() {
        return account_ID;
    }

    public void depositAssets(int amount) {
        assets = assets + amount;
    }

    public void withdrawAssets(int amount) {
        assets = assets - amount;
    }
}
