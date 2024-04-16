package katherina.week7.day01.zoo;

import java.util.Vector;

public class Gehege {
    private String name;
    private Zoo zoo;
    private Vector<Tier> tierliste;


    public Gehege(String name) {
        this.name = name;
        this.zoo = null;
        tierliste = new Vector<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Zoo getZoo() {
        return zoo;
    }

    void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addTier(Tier tier) {
        if (tier != null) {
            tier.setGehegeIntern(this);
        }
        tierliste.add(tier);
    }

    public void removeTier(Tier tier) {
        tierliste.remove(tier);
    }

    @Override
    public String toString() {
        String gehegestring;
        gehegestring = "│    ├── Gehege: " + name + "\n";
        if (tierliste != null) {
            for (Tier ausgabe : tierliste) {
                gehegestring += ausgabe;
            }
        }
        if (tierliste.isEmpty()) {
            gehegestring += "│        ├── dieses Gehege enthält keine Tiere. Bitte füge Tiere hinzu!\n";
        }
        return gehegestring;
    }


}




