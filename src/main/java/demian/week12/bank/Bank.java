package demian.week12.bank;

import java.util.Vector;

public class Bank {
    private Vector<Customer> customerList;

    public Bank() {
        this.customerList = new Vector<>();
    }

    public void addCustomer(Customer name) {
        customerList.add(name);
    }
}
