package katherina.week06.day02.Fotoapparat;

public class Kamera {

    private final int brennweiteMin;
    private final int brennweiteMax;
    private final String model;
    private final String hersteller;
    private final float megapixel;

    public Kamera(int brennweiteMin, int brennweiteMax, String model, String hersteller, float megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }



    @Override
    public String toString() {
        return "Dies ist eine Kamera des Typs "+ model+
                ", hergestellt von "+hersteller+
                ". Ihre kleinste Brennweite beträgt "+brennweiteMin+
                "mm und ihre größte Brennweite beträgt "+brennweiteMax+
                "mm. Die damit geschossenen Bilder haben eine Auflösung von bis zu "+megapixel+
        " Megapixel.";
    }
}
