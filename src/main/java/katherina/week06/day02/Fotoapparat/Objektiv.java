package katherina.week06.day02.Fotoapparat;

//Ich glaube, ich will tauschbare Elemente als eigene Klassen, weil sie nicht an der Kamera dran sind, sondern abgemacht
//werden können. (Im Softwarekontext: Das ist ein DLC, auf das vom Hauptprogramm zugegriffen werden *kann*, aber nicht muss.

public class Objektiv {
    private int brennweiteMin;
    private int brennweiteMax;
    private Kamera kamera;


    public Objektiv(int brennweiteMin, int brennweiteMax) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.kamera = null;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMax(int brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public Kamera getKamera() {
        return kamera;
    }

    void setKameraIntern(Kamera kamera) {
        this.kamera = kamera;
    }

    public void setKamera(Kamera kamera) {
        if ((kamera != null) && (kamera.getObjektiv() == null)) {
            kamera.setObjektiv(this);
        } else if (kamera == null && this.kamera != null) {
            this.kamera.setObjektiv(null);
        }
    }



    @Override
    public String toString() {
        return "Es ist ein Objektiv ausgerüstet, dessen kleinste Brennweite " + brennweiteMin +
                "mm und dessen größte mögliche Brennweite " + brennweiteMax + "mm beträgt.";
    }
}
