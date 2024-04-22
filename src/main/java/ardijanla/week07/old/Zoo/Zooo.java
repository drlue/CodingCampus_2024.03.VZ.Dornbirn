package ardijanla.week07.old.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Zooo {
    String name;

    String foundingYear;

    List<Gehege> gehegeList;

    List<Pfleger> pflegerList;

    public Zooo(String name, String foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        gehegeList = new ArrayList<>();
        pflegerList = new ArrayList<>();
    }

    public void addPfleger(Pfleger pfleger) {
        pflegerList.add(pfleger);
    }

    public void addGehege(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        gehegeList.remove(gehege);
    }

    private double berechneGesamtkosten() {
        double gesKosten = 0;

        for (Gehege g : gehegeList) {
            for (Tier t : g.getTiere()) {
                for (Map.Entry<Futter, Integer> f : t.getFutterBedarf().entrySet()) {
                    Futter futter = f.getKey();
                    Integer menge = f.getValue();
                    gesKosten += futter.getKosten(menge);
                }
            }
        }
        return gesKosten;
    }

    public void starteTagesroutine() {
        for (Pfleger pfleger : pflegerList) {
            System.out.println("Pfleger: " + pfleger + " Start");
            for (Gehege gehege : pfleger.getVerantwortlicheGehege()) {
                gehege.tierFuettern(pfleger);

                gehege.gehegeBearbeiten();
            }
        }
        for (Gehege gehege : gehegeList) {
            gehege.resetTag();
        }
    }

    public void wochenroutine() {
        for (int i = 0; i < 7; i++) {
                System.out.println("Tag " + i);
                starteTagesroutine();
        }
    }

    public String getGesamkostenSTR() {
        double t = berechneGesamtkosten();
        return t + "€";
    }

    public String getTreeView() {
        StringBuilder sb = new StringBuilder();
        sb.append("├── Zooo: ").append(name).append(", gegründet ").append(foundingYear).append("\n");
        for (Gehege g : gehegeList) {

            sb.append(g.getGehegeView());
        }
        return sb.toString();
    }
}
