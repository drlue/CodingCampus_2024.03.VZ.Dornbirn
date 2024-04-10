package irem.Fotoapparat;

public class Fotoapparat {
    private String modell;
    private String hersteller;
    private int megapixel;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;

    // Konstruktor
    public Fotoapparat(String hersteller, String modell, int megapixel, Objektiv objektiv, Speicherkarte speicherkarte) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;
    }


    // Methode zum Fotografieren
    public void takePhoto() {
        boolean ok = speicherkarte.saveImage(0.3 * megapixel);
        if (ok) {
            System.out.println("Ein Foto wurde aufgenommen!");
        } else {
            System.out.println("Nicht genug Speicherplatz vorhanden!");
        }
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

