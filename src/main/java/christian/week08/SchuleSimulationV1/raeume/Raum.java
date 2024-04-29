package christian.week08.SchuleSimulationV1.raeume;

import christian.week08.SchuleSimulationV1.Schule;
import christian.week08.SchuleSimulationV1.personV1.Lehrer;
import christian.week08.SchuleSimulationV1.personV1.Schulklasse;


public abstract class Raum {
    private String name;
    private Lehrer aktiverLehrer;
    private Schulklasse aktiveKlasse;

    public Raum(String name) {
        this.name = name;
        aktiverLehrer = null;
        aktiveKlasse = null;
    }

    //======================================================================================================get=========
    public String getLehrerName() {
        if (aktiverLehrer != null) {
            return aktiverLehrer.getName();
        } else {
            return null;
        }
    }

    public String getKlassenname() {
        if (aktiveKlasse != null) {
            return aktiveKlasse.getName();
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public Schulklasse getAktiveKlasse() {
        return aktiveKlasse;
    }

    public Lehrer getAktiverLehrer() {
        return aktiverLehrer;
    }
    //======================================================================================================set=========

    public void setAktiveKlasse(Schulklasse aktiveKlasse) {
        this.aktiveKlasse = aktiveKlasse;
    }

    public void setAktiverLehrer(Lehrer aktiverLehrer) {
        this.aktiverLehrer = aktiverLehrer;
    }

    public Schulklasse getKlassefromPlan(int hour) {
        return null;
    }

    public Lehrer getLehrer(int hour){
        return null;
    }

    //======================================================================================================print=======

    //======================================================================================================create======
    //==================================================================================================add/remove======


    //==================================================================================================alter===========
    //==================================================================================================simulate========
}
