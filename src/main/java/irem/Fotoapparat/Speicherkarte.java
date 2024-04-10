package irem.Fotoapparat;

public class Speicherkarte {

    private double kapazitaetMB;
    private double verbrauchterSpeicherMB = 0;


    public Speicherkarte(double kapazitaetMB) {
        this.kapazitaetMB = kapazitaetMB;
    }


    public boolean saveImage(double imageSize) {
        if (kapazitaetMB >= verbrauchterSpeicherMB+imageSize) {
            verbrauchterSpeicherMB = verbrauchterSpeicherMB + imageSize;
            return true;
        }
        return false;
    }

}

