package katherina.week06.day02.Fotoapparat;

public class Eigenschaften {
    private int brennweiteMin;
    //Die Brennweite wird in mm angegeben, also 28mm, 50mm. Daher int.
    private int brennweiteMax;
    private String model;
    private String hersteller;
    private float megapixel;
    //Megapixel werden meist in Ganzzahlen ausgegeben, aber durchaus häufig auch mit 1-2 Nachkommastellen.

    private Kamera kamera;

    public Eigenschaften(Kamera kamera) {
        this.kamera = kamera;
    }

    public void setBrennweiteMin(int brennweiteMin){
        this.brennweiteMin = brennweiteMin;
    }

    public int getBrennweiteMin(){
        return brennweiteMin;
    }

    public void setBrennweiteMax(int brennweiteMax){
        this.brennweiteMax = brennweiteMax;
    }

    public int getBrennweiteMax(){
        return brennweiteMax;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return this.hersteller;
    }

    public void setMegapixel(float megapixel){
        this.megapixel = megapixel;
    }

    public float getMegapixel(){
        return megapixel;
    }

}
