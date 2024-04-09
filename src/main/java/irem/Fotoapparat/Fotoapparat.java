package irem.Fotoapparat;

public class Fotoapparat {
    private int brennweiteMin;
    private int brennweiteMax;
    private String modell;
    private String hersteller;
    private int megapixel;

    // Konstruktor
    public Fotoapparat(int brennweiteMin, int brennweiteMax, String modell, String hersteller, int megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }
    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiteMax(int brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    // Methode zum Fotografieren
    public void takePhoto() {
        System.out.println("Klick! Ein Foto wurde mit " + modell + " von " + hersteller + " aufgenommen.");
    }

    // Überschriebene toString() Methode
    @Override
    public String toString() {
        return "Fotoapparat{" +
                "brennweiteMin=" + brennweiteMin +
                ", brennweiteMax=" + brennweiteMax +
                ", modell='" + modell + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", megapixel=" + megapixel +
                '}';
    }
}
