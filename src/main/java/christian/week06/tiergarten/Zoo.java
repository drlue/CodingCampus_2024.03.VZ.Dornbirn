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
        beschreibung += "|---Zoo: " + name + ", geründet " + gruendungsJahr + "\n";
        if (gehegeListe != null) {
            for (Gehege x : gehegeListe) {
                beschreibung += x.toString();
            }
        }
        return beschreibung;
    }
}
