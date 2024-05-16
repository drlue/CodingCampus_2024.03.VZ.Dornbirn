package demian.week12.bank;

public class Account {
    private int accountNR;
    private int accountBalance;

    public Account(int account) {
        this.accountNR = account;
    }

    public void deposit(int depositAmount) {
        this.accountBalance = accountBalance + depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("No withdraw allowed");
        } else {
            this.accountBalance = accountBalance - withdrawAmount;
        }
    }

}
