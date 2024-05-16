package ardijanla.ArdijansBank.models;

import java.util.List;

public class Bank {

    private int idbank;

    private String bankname;

    private String location;

    private List<Account> accounts;

    public Bank(int idbank, String bankname, String location, List<Account> accounts) {
        this.idbank = idbank;
        this.bankname = bankname;
        this.location = location;
        this.accounts = accounts;
    }


    public String getBankname() {
        return bankname;
    }

    public String getLocation() {
        return location;
    }

    public int getIdbank() {
        return idbank;
    }

    public void setIdbank(int idbank) {
        this.idbank = idbank;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
