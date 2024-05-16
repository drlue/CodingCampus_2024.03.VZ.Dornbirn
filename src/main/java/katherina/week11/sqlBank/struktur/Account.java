package katherina.week11.sqlBank.struktur;

public class Account {
    private int iD;
    private float balance;

    public Account() {
        this.iD = iD;
        this.balance = balance;
    }

    public void setId(int iD) {
        this.iD = iD;
    }

    public int getId() {
        return iD;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void printStructure() {
        System.out.printf("Konto-ID:  %d %n Kontostand: %.2f %n", iD, balance);
    }


}
