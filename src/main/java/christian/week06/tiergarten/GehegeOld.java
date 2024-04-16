package christian.week06.tiergarten;

import java.util.ArrayList;
import java.util.List;

public class GehegeOld {
    private String name;
    private List<TierOld> tierOldListe;

    public GehegeOld(String name) {
        this.name = name;
        this.tierOldListe = new ArrayList<TierOld>();
    }

    public String getName() {
        return name;
    }

    public List<TierOld> getTierListe(){
        return tierOldListe;
    }
    public void addTierToList (TierOld tierOld) {
        tierOldListe.add(tierOld);
    }



    public String toString() {
        String beschreibung = "";
        beschreibung += "  |---Gehege: " + name + "\n";
        for (TierOld x : tierOldListe) {
            beschreibung += x.toString();
        }
        return beschreibung;
    }
}
