package irem.Fotoapparat;

public class Speicherkarte {

    private double kapazitaetMB;
    private double verbrauchterSpeicherMB = 0;

    public Speicherkarte(double kapazitaetMB) {
        this.kapazitaetMB = kapazitaetMB;
    }

    public double getKapazitaetMB() {
        return kapazitaetMB;
    }

    public double getVerbrauchterSpeicherMB() {
        return verbrauchterSpeicherMB;
    }

    public void setKapazitaetMB(double kapazitaetMB) {
        this.kapazitaetMB = kapazitaetMB;
    }

    public void addVerbrauchterSpeicherMB(double speicherMB) {
        this.verbrauchterSpeicherMB += speicherMB;
    }

    public void resetVerbrauchterSpeicher() {
        this.verbrauchterSpeicherMB = 0;
    }

    public double verfuegbarerSpeicherMB() {
        return kapazitaetMB - verbrauchterSpeicherMB;
    }
}

