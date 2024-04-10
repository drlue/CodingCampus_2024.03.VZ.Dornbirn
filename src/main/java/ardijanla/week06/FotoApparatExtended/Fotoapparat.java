package ardijanla.week06.FotoApparatExtended;

public class Fotoapparat {

    private String model;
    private String hersteller;

    private Objektiv objektiv;
    private Speicherkarte speicherkarte;
    private int megaPixel;

    private static int photosTaken;


    public Fotoapparat(String model, String hersteller, Objektiv objektiv, Speicherkarte speicherkarte, int megaPixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;
        this.megaPixel = megaPixel;
    }

    public Fotoapparat(String model, String hersteller, int megaPixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.objektiv = null;
        this.speicherkarte = null;

        this.megaPixel = megaPixel;
    }


    private double calculateSizeOfPhoto() {
        return 0.3 * megaPixel;
    }

    private boolean isCameraFull() {
        if (speicherkarte.speicherKapazitaet < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void changeStorage(Speicherkarte neuerspeicher) {
        this.speicherkarte = neuerspeicher;
    }


    public void setObjektiv(Objektiv objektiv) {
        if (objektiv != null) {
            if (objektiv.getFotoapparat() != null) {
                objektiv.getFotoapparat().objektiv = null;
            }
            objektiv.setFotoapparatIntern(this);
        }
        this.objektiv = objektiv;
    }

    public void takePhoto() {
        if (isCameraFull()) {
            System.out.println("click");
            photosTaken++;
            System.out.println(speicherkarte.speicherKapazitaet);
            this.speicherkarte.speicherKapazitaet -= calculateSizeOfPhoto();
        } else {
            System.out.println("kamera ist voll du kannst kein foto mehr machen bitte speicher tauschen");
        }

    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public String toString() {
        if (speicherkarte == null || objektiv == null){
            System.out.println("kamera hat kein objektiv ode rspeicherkarte");
            return "";
        }else {
            String camInfo =
                    "hersteller: " + hersteller + "\n" +
                            "speicherKapazitaet: " + speicherkarte.getSpeicherKapazitaet() + "\n" +
                            "brennweiteMin: " + objektiv.brennweiteMin + "\n" +
                            "brennweiteMax: " + objektiv.brennweiteMax + "\n" +
                            "megaPixel: " + megaPixel + "\n" +
                            "Fotos aufgenommen: " + photosTaken + "\n";

            return camInfo;
        }

    }

}
