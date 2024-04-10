package ardijanla.week06.AufgabeFotoapparat;

public class Fotoapparat {

    int brennweiteMin;
    int brennweiteMax;
    String model;
    private String hersteller;
    int megapixel;


    public Fotoapparat(int brennweiteMin, int brennweiteMax, String model, String hersteller, int megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public void takePhoto(){
        System.out.println("Blitz ><<><<<<<<");
    }

    public String toString(){
        String camInfo =
                        "model: " +  model + "\n" +
                        "Brennweite: " +  brennweiteMin +"-"+ brennweiteMax + "mm\n" +
                        "hersteller: " +  hersteller + "\n" +
                        "megapixel: " +  megapixel + "\n";

        return camInfo;
    }

    public void getCamInfo(){

    }

}
