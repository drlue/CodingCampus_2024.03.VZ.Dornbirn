package christian.week06.tiergarten;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private String name;
    public List<Tier> tierListe;

    public Gehege(String name) {
        this.name = name;
        this.tierListe = new ArrayList<Tier>();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String beschreibung = "";
        beschreibung += "  |---Gehege: " + name + "";
        for (Tier x : tierListe) {
            beschreibung += x.toString();
        }
        return beschreibung;
    }
}
