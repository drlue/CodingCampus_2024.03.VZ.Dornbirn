package katherina.week7.day01.zoo;

import java.util.Vector;

public class Gehege {
    private String name;
    private Zoo zoo;
    private Tier tier;

    //Ich möchte für jeden Gehegetyp einen eigenen Vector anlegen, weil ich das innerweltlich logischer finde:
    //Ich kann zwar eine Kuh auch ins Ried stellen und einen Storch ins Terrarium - oder gar Aquarium!
    //Aber klug ist das nicht. Also lassen wir das besser sein ;-)
    //Es ist informatisch einen Tick unflexibel, aber wie gesagt... realistischer.

    private Vector<Tier> wiesentierliste;
    private Vector<Tier> riedtierliste;
    private Vector<Tier> terrariumListe;


    public Gehege(String name) {
        this.name = name;
        this.zoo = null;
        wiesentierliste = new Vector<>();
        riedtierliste = new Vector<>();
        terrariumListe = new Vector<>();
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

    public void setTier(Tier tier) {
        if (tier != null) {
            if (tier.getGehege() != null) {
                tier.getGehege().tier = null;
            }
            tier.setGehegeIntern(this);
        }
        this.tier = tier;
    }

    public Tier getTier() {
        return tier;
    }

    public void addWiesentier(Tier tier) {
        if (tier != null) {
            tier.setGehegeIntern(this);
        }
        wiesentierliste.add(tier);
    }

    public void addRiedTier(Tier tier) {
        if (tier != null) {
            tier.setGehegeIntern(this);
        }
        riedtierliste.add(tier);
    }

    public void addTerrariumWarmesTier(Tier tier) {
        if (tier != null) {
            tier.setGehegeIntern(this);
        }
        terrariumListe.add(tier);
    }

    public void addPersonal(Pfleger pfleger) {
        if (pfleger != null) {
            pfleger.setZooIntern(this.getZoo());
        }
       // pfleger.add(pfleger);
    }



    @Override
    public String toString() {
        String gehegestring = "";
        gehegestring = "    ├── Gehege: " + name + "\n";
        if (wiesentierliste != null) {
            for (Tier ausgabe : wiesentierliste) {
                gehegestring += ausgabe;
            }
        }
        if (wiesentierliste == null) {
            gehegestring += "(leer2)";
        }
        if (riedtierliste != null) {
            for (Tier ausgabe : riedtierliste) {
                gehegestring += ausgabe;
            }
        }
        if (riedtierliste == null) {
            gehegestring += "(leer)";
        }
        if (terrariumListe != null) {
            for (Tier ausgabe : terrariumListe) {
                gehegestring += ausgabe;
            }
        }
        if (terrariumListe == null) {
            gehegestring += "├──(leer)";
        }
        return gehegestring;
    }
}



