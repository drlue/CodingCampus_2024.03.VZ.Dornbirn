package irem.Fotoapparat;

public class Fotoapparat {
    private String modell;
    private String hersteller;
    private int megapixel;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;

    // Konstruktor
    public Fotoapparat( String hersteller,String modell,int megapixel, Objektiv objektiv, Speicherkarte speicherkarte) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;
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

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public Speicherkarte getSpeicherkarte() {
        return speicherkarte;
    }

    public void setSpeicherkarte(Speicherkarte speicherkarte) {
        this.speicherkarte = speicherkarte;
    }


    // Methode zum Fotografieren
    public void takePhoto() {
        if (speicherkarte.verfuegbarerSpeicherMB() >= megapixel * 0.3) {
            speicherkarte.addVerbrauchterSpeicherMB(megapixel * 0.3);
            System.out.println("Ein Foto wurde aufgenommen!");
        } else {
            System.out.println("Nicht genug Speicherplatz vorhanden!");
        }
    }

    public int anzahlFotos() {
        return (int) (speicherkarte.getVerbrauchterSpeicherMB() / (megapixel * 0.3));
    }

    public double verfuegbarerSpeicherMB() {
        return speicherkarte.verfuegbarerSpeicherMB();
    }

    // Überschriebene toString() Methode
    @Override
    public String toString() {
        return "Fotoapparat{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", megapixel=" + megapixel +
                '}';
    }
}

