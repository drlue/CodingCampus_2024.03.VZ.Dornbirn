package christian.week06.tiergarten;

import java.util.List;

public class Zoo {
    private String name;
    private int gruendungsJahr;
    public List<Gehege> gehegeListe;

    public Zoo(String name, int gruendungsJahr) {
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
        this.gehegeListe = null;
    }

    public String toString() {
        String beschreibung = "";
        if (gehegeListe == null) {
            beschreibung += "|---Zoo: " + name + ", geründet " + gruendungsJahr;
        } else if (gehegeListe != null) {
            beschreibung += "|---Zoo: " + name + ", geründet " + gruendungsJahr;
            for (Gehege x : gehegeListe) {
                beschreibung += "\n    |---Gehege: " + x.getName();
                for (Tier y : x.tierListe){
                    beschreibung += "\n"+y.toString();
                }
            }
        }
        return beschreibung;
    }
}
