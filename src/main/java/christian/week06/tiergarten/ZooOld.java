package christian.week06.tiergarten;

import java.util.ArrayList;
import java.util.List;

public class ZooOld {
    private String name;
    private int gruendungsJahr;
    private float vermoegen;
    private List<GehegeOld> gehegeOldListe;

    public ZooOld(String name, int gruendungsJahr, float vermoegen) {
        this.vermoegen = vermoegen;
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
        this.gehegeOldListe = new ArrayList<GehegeOld>();
    }

    public float getVermoegen() {
        return vermoegen;
    }

    public void setVermoegen(float kosten){
        vermoegen-=kosten;
    }
     public List<GehegeOld> getGehegeListe(){
        return gehegeOldListe;
     }
     public void addGehege (GehegeOld gehegeOld){
        gehegeOldListe.add(gehegeOld);
    }

    public String toString() {
        String beschreibung = "";
        beschreibung += "|---Zoo: " + name + ", geründet " + gruendungsJahr + "\n";
        if (gehegeOldListe != null) {
            for (GehegeOld x : gehegeOldListe) {
                beschreibung += x.toString();
            }
        }
        return beschreibung;
    }
}
