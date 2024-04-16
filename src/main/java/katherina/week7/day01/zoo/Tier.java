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

    @Override
    public String toString() {
        return "        ├── " + name + ", " + gattung+"\n";
    }




}
