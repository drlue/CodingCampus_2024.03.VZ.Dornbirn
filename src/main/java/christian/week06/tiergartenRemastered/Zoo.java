package christian.week06.tiergartenRemastered;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private int gruendungsjahr;
    private List<Gehege> gehegeList;
    private List<Pfleger> pflegerList;

    private List<TierArzt> tierArztList;

    public Zoo(String name, int gruendungsjahr) {

        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        gehegeList = new ArrayList<>();
        pflegerList = new ArrayList<>();
        tierArztList = new ArrayList<>();

    }

    public void printStructure() {

        System.out.println("|---Zoo: " + name + ", gegruendet am: " + gruendungsjahr);
        for (Gehege x : gehegeList) {
            x.printStructure();
        }
        System.out.println("TierPfleger: ");
        for (Pfleger p : pflegerList) {
            System.out.println("   |---" + p.getName());
            p.getGehegeList();
        }
        System.out.println("TierAerzte: ");
        for(TierArzt t:tierArztList){
            System.out.println("   |---" + t.getName());
            t.getGehegeList();
        }
    }

    public void addGehege(Gehege newGehege) {
        if (!gehegeList.contains(newGehege)) {
            gehegeList.add(newGehege);
            System.out.println("Gehege " + newGehege.getName() + " wurde " + name + " hinzugefügt!");
        } else {
            System.out.println("Gehege existiert schon im Zoo!");
        }
    }

    public void removeGehege(Gehege gehegeToRemove) {
        if (gehegeList.contains(gehegeToRemove)) {
            gehegeList.remove(gehegeToRemove);
            System.out.println("Gehege wurde abgerissen!");
        } else {
            System.out.println("Gehege existiert nicht im Zoo!");
        }
    }

    public void addPfleger(Pfleger pfleger) {
        if (!pflegerList.contains(pfleger)) {
            pflegerList.add(pfleger);
            System.out.printf("Pfleger %s wurde eingestellt!\n", pfleger.getName());
        } else {
            System.out.println("Dieser Pfleger arbeitet bereits im Zoo!");
        }
    }

    public void addTierArztToList(TierArzt tierArzt) {
        if(!tierArztList.contains(tierArzt)){
            this.tierArztList.add(tierArzt);
            System.out.printf("Tierarzt %s wurde eingestellt!\n",tierArzt.getName());
        }

    }

    public void removePfleger(Pfleger pfleger) {
        if (pflegerList.contains(pfleger)) {
            pflegerList.remove(pfleger);
            System.out.printf("Pfleger %s wurde gefeuert!\n", pfleger.getName());
        } else {
            System.out.printf("Pfleger %s arbeitet nicht im Zoo!\n", pfleger.getName());
        }
    }

    public void printFutterKosten() {
        Map<Futter, Float> futterBedarfMap = new HashMap<>();
        for (Gehege gehege : gehegeList) {
            gehege.getFutterBedarf(futterBedarfMap);
        }
        System.out.printf("\nDie taegliche Kosten fuer Futter belaufen sich auf : %15.2f €/Tag\n", calculateFutterKosten(futterBedarfMap));
    }

    public float calculateFutterKosten(Map<Futter, Float> futterbedarf) {
        float futterKosten = 0;
        for (Map.Entry<Futter, Float> entry : futterbedarf.entrySet()) {
            System.out.printf("\nFutter:%10s    ->    Futtermenge: %.2f    ->    Kosten: %6.2f €/Tag", entry.getKey().getName(), entry.getValue(), entry.getValue() * entry.getKey().getEinheitsPreis());
            futterKosten += entry.getValue() * entry.getKey().getEinheitsPreis();
        }
        return futterKosten;
    }

    public void arbeitBeauftragen() {
        for (Pfleger p : pflegerList) {
            p.rundgang(p);
        }
        for(TierArzt a:tierArztList){
            a.rundgang();
        }
    }

    public void tierAktivitaeten() {
        for (Gehege g : gehegeList) {
            g.tierAktivitaetenInGehege();
        }
    }

    public void resetDay() {
        for (Gehege x : gehegeList) {
            x.resetArbeitErledigt();
        }
    }
}
