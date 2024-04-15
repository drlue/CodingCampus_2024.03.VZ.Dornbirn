package christian.week06.tiergarten.hilfsKlassen;

import christian.week06.tiergarten.Tier;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistik {
    private float futterKosten;
    private float personalkosten;
    private float gehegeInstandhaltung;
    private float kapital;
    private Map futterMittelMap = new HashMap<>();

    public Statistik(List<Futter> futterList, List<Tier> tierList, float kapital) {
        this.kapital = kapital;
        personalkosten = 0;
        gehegeInstandhaltung = 0;
        Map<String, Float> futterMittelMap = createFuttermittel(futterList);
        futterKosten = setFutterKosten(tierList);
    }

    public Map createFuttermittel(List<Futter> futterList) {
        for (Futter f : futterList) {
            futterMittelMap.put(f.getName(), f.getEinheitsPreis());
        }

        return futterMittelMap;
    }

    public float setFutterKosten(List<Tier> tierList) {
        float kosten = 0;

        for (Tier t : tierList) {

            kosten += t.getFutterMenge() * ((float) futterMittelMap.get(t.getFutter().getName()));
        }
        return kosten;
    }

    public float getFutterKosten() {
        return futterKosten;
    }

    public float getPersonalkosten() {
        return personalkosten;
    }

    public float getGehegeInstandhaltung() {
        return gehegeInstandhaltung;
    }

    public float getKapital() {
        return kapital;
    }
    public float getDaysUntilBroke(){
        float days = kapital/this.getFutterKosten();
        return days;
    }
}
