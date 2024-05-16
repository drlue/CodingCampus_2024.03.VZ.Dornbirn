package luki.week12.db.bank2.model;

public class Bank {
    private int bankID;
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public int getBankID() {
        return bankID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankID=" + bankID +
                ", name='" + name + '\'' +
                '}';
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
