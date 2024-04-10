package katherina.week06.day02.Fotoapparat;

public class Speicherkarte {

    private int speicherplatzMB;
    private int verbrauch = 0;
    private Kamera kamera;


    public Speicherkarte(int speicherplatzMB) {
        this.speicherplatzMB = speicherplatzMB;
        this.kamera = null;
    }


    public Kamera getKamera() {
        return kamera;
    }

    void setKameraIntern(Kamera kamera) {
        this.kamera = kamera;
    }


    public boolean saveImage(int imageSize) {
        if (speicherplatzMB >= verbrauch+imageSize) {
            verbrauch = verbrauch + imageSize;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Der Speicherplatz auf der eingelegten Karte beträgt "+ speicherplatzMB +" Megabyte.";
    }
}
