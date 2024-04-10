package katherina.week06.day02.Fotoapparat;

public class Speicherkarte {

    private int speicherkarte;
    private Kamera kamera;


    public Speicherkarte(int speicherkarte) {
        this.speicherkarte = speicherkarte;
        this.kamera = null;
    }

    public void setSpeicherkarte(int speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public int getSpeicherkarte() {
        return speicherkarte;
    }


    public Kamera getKamera() {
        return kamera;
    }

    void setKameraIntern(Kamera kamera) {
        this.kamera = kamera;
    }

    public void setKamera(Kamera kamera) {
        if ((kamera != null) && (kamera.getSpeicherkarte() == null)) {
            kamera.setSpeicherkarte(this);
        } else if (kamera == null && this.kamera != null) {
            this.kamera.setSpeicherkarte(null);
        }
    }



    @Override
    public String toString() {
        return "Der Speicherplatz auf der eingelegten Karte beträgt "+ speicherkarte +" Megabyte.";
    }
}
