package katherina.week7.day01.zoo;

public class Tier {
    private String name;
    private String gattung;
    private Gehege gehege;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGattung() {
        return this.gattung;
    }


    public Gehege getGehege() {
        return gehege;
    }

    void setGehegeIntern(Gehege gehege) {
        this.gehege = gehege;
    }

    public void setGehege(Gehege gehege) {
        if (gehege != null) {
            gehege.addTier(this);
        } else if (gehege == null && this.gehege != null) {
            this.gehege.removeTier(null);
        }
    }


    public void printStructure() {
        System.out.printf("│        ├── %s, %s %n", name, gattung);
    }
}
