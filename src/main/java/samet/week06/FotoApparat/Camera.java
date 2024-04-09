package samet.week06.FotoApparat;

public class Camera {

    private String modell;
    private String hersteller;
    private int megapixel;
    private Memory speicherkarte;
    private Objektiv objektiv;


    public Camera(String modell, String hersteller, int megapixel) {

        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.objektiv = null;
        this.speicherkarte = null;
    }

    public String getModell() {
        return modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public float getMegapixel() {
        return megapixel;
    }

    public Memory getSpeicherkarte() {
        return speicherkarte;
    }

    public void takePicture() {
        if (objektiv == null){
            System.out.println(" Photo without objective is not possible");
        } else if (speicherkarte == null) {
            System.out.println("Photo without memory card is not possible");
        }else {
            boolean saved = speicherkarte.savePhoto(megapixel);
            if (saved){
                System.out.println("CLICK!!!");
            }
        }
    }
    public void setObjektiv(Objektiv objektiv){
        this.objektiv = objektiv;
    }
    public void setSpeicherkarte(Memory memory){
        this.speicherkarte = speicherkarte;
    }

    public String toString() {
        return
                hersteller + " " + modell + (objektiv != null ? " with " + objektiv + " objektiv" : " without objektiv");
    }



}


