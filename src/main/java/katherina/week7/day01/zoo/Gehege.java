package katherina.week7.day01.zoo;

import java.util.Vector;

public class Gehege {
    private String name;
    private Zoo zoo;
    private Vector<Tier> tierliste;
    private Vector<Pfleger> personenliste;

    public Gehege(String name) {
        this.name = name;
        this.zoo = null;
        tierliste = new Vector<>();
        personenliste = new Vector<>();
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

    public void addPersonal(Pfleger pfleger) {
        if (pfleger != null) {
            pfleger.setZooIntern(this.getZoo());
        }
        personenliste.add(pfleger);
    }

    public void removePersonal(Pfleger pfleger) {
        personenliste.remove(pfleger);
    }

    @Override
    public String toString() {
        String gehegestring;
        String personenstring;
        gehegestring = "│    ├── Gehege: " + name + "\n";
        personenstring = "";
        if (tierliste != null) {
            for (Tier ausgabe : tierliste) {
                gehegestring += ausgabe;
            }
        }
        if (!tierliste.isEmpty()) {
            for (Pfleger ausgabe : personenliste) {
                personenstring += ausgabe;
            }
        }
        if (tierliste.isEmpty()) {
            gehegestring += "│        ├── dieses Gehege enthält keine Tiere. Bitte füge Tiere hinzu!\n";
        }
        if (personenliste.isEmpty()) {
            personenstring += "│            ├── für dieses Gehege ist niemand zuständig!\n";
        }
        return gehegestring + personenstring;
    }


}




