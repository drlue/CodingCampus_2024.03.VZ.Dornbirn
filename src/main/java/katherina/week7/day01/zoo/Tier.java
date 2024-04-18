package katherina.week7.day01.zoo;

import java.util.Vector;

public class Tier {
    private String name;
    private String gattung;
    private Gehege gehege;
    private int gesundheit;
    private int maxGesundheit;
    private int biss;
    private boolean gebissen = Math.random() < 0.4;
    private Vector<Tier> tierliste;

    public Tier(String name, String gattung, int gesundheit, int maxGesundheit, int biss) {
        this.name = name;
        this.gattung = gattung;
        this.gesundheit = gesundheit;
        this.maxGesundheit = maxGesundheit;
        this.biss = biss;
        tierliste = new Vector<>();

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
    public int getGesundheit() {
        return this.gesundheit;
    }

    public int getMaxGesundheit() {
        return this.maxGesundheit;
    }

    public int getBiss() {
        return this.biss;
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

    public boolean isGebissen() {
        return gebissen;
    }
    public boolean lebtInGehege(Gehege tier) {
     return tierliste.contains(tier);
    }

    public int bissSimulator(Tier tier){
        int result = maxGesundheit;
        Vector<Tier> tierInGehege = new Vector<>();
        for (Tier tierchen : tierliste){
            if (tierchen.lebtInGehege(gehege)){
                tierInGehege.add(tier);
                for (int index = 0; index < tierInGehege.size(); index++) {
                    if (gebissen){
                        result = gesundheit-biss;
                    }
                }
            }
        }
        return result;
    }
}
