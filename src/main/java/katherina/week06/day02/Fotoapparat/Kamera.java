package katherina.week06.day02.Fotoapparat;

public class Kamera {


    private String model;
    private String hersteller;
    private float megapixel;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;


    public Kamera(String model, String hersteller, float megapixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
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

    public void setSpeicherkarte(Speicherkarte speicherkarte){
        if (speicherkarte != null) {
            if (speicherkarte.getKamera() != null) {
                speicherkarte.getKamera().speicherkarte = null;
            }
            speicherkarte.setKameraIntern(this);
        }
        this.speicherkarte = speicherkarte;
    }

    public Speicherkarte getSpeicherkarte(){
        return speicherkarte;
    }

    public void setObjektiv(Objektiv objektiv) {
        if (objektiv != null) {
            if (objektiv.getKamera() != null) {
                objektiv.getKamera().objektiv = null;
            }
            objektiv.setKameraIntern(this);
        }
        this.objektiv = objektiv;
    }
    //Testen und angucken, was passiert, wenn ich ein zugewiesenes Objektiv "tausche"!!!!!!

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void takePhoto(){
        System.out.println(model + " von " + hersteller+": cliiiiick!");
    }

    @Override
    public String toString() {
        return "Dies ist eine Kamera des Typs "+ model+
                ", hergestellt von "+hersteller+
                ". Die damit geschossenen Bilder haben eine Auflösung von bis zu "+megapixel+
        " Megapixel. "+objektiv+speicherkarte;
    }
}
