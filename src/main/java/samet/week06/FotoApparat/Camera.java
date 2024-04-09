package samet.week06.FotoApparat;

public class Camera {

    private String modell;
    private String hersteller;
    private double megapixel;
    private double preis;

    private int brennWeiteMax;
    private int brennWeiteMin;

    public Camera(String modell, String hersteller, double megapixel, double preis, int brennWeiteMax, int brennWeiteMin){

        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.preis = preis;
        this.brennWeiteMax = brennWeiteMax;
        this.brennWeiteMin = brennWeiteMin;
    }
    public String getModell(){
        return modell;
    }
    public String getHersteller(){
        return hersteller;
    }
    public double getMegapixel(){
        return megapixel;
    }
    public double getPreis(){
        return preis;
    }
    public int getBrennWeiteMax(){
        return brennWeiteMax;
    }
    public int getBrennWeiteMin(){
        return brennWeiteMin;
    }

    public String toString(){
        return
                "Modell: " + modell + "\n" +
                        "Hersteller: " + hersteller + "\n" +
                        "MegaPixel: " + megapixel + "\n" +
                        "Preis: " + preis + "\n" +
                        "Maximale Brennweite: " + brennWeiteMax + "\n" +
                        "Minimale Brennweite: " + brennWeiteMin + "\n";

    }
}
