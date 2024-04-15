package christian.week06.tiergarten;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private int gruendungsJahr;
    private float vermoegen;
    public List<Gehege> gehegeListe;

    public Zoo(String name, int gruendungsJahr, float vermoegen) {
        this.vermoegen = vermoegen;
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
        this.gehegeListe = new ArrayList<Gehege>();
    }

    public float getVermoegen() {
        return vermoegen;
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
