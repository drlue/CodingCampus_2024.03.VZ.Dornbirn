package christian.week06.tiergarten.hilfsKlassen;

import christian.week06.tiergarten.TierOld;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatistikOld {
    private float futterKosten;
    private float personalkosten;
    private float gehegeInstandhaltung;
    private float kapital;
    private Map futterMittelMap = new HashMap<>();

    public StatistikOld(List<FutterOld> futterOldList, List<TierOld> tierOldList, float kapital) {
        this.kapital = kapital;
        personalkosten = 0;
        gehegeInstandhaltung = 0;
        futterMittelMap = createFuttermittel(futterOldList);
        futterKosten = setFutterKosten(tierOldList);
    }

    public Map createFuttermittel(List<FutterOld> futterOldList) {
        for (FutterOld f : futterOldList) {
            futterMittelMap.put(f.getName(), f.getEinheitsPreis());
        }

        return futterMittelMap;
    }

    public float setFutterKosten(List<TierOld> tierOldList) {
        float kosten = 0;

        for (TierOld t : tierOldList) {

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

    public void tagesAbrechnung(List<TierOld> tierOldList){
        setFutterKosten(tierOldList);
        kapital-=futterKosten;
        kapital-=personalkosten;
        kapital-=gehegeInstandhaltung;
    }
}
