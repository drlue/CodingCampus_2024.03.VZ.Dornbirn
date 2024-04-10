package samet.week06.FotoApparat;

public class Objektiv {

    private String hersteller;
    private String model;
    private int brennWeiteMax;
    private int brennWeiteMin;

    public Objektiv(String hersteller, String model, int brennWeiteMin, int brennWeiteMax){
        this.hersteller = hersteller;
        this.model = model;
        this.brennWeiteMin = brennWeiteMin;
        this.brennWeiteMax = brennWeiteMax;

    }
    public String toString(){
        return hersteller + " " + model;
    }
}
