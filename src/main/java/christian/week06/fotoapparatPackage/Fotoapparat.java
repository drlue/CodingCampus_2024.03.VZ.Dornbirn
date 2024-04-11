package christian.week06.fotoapparatPackage;

import java.util.Scanner;

public class Fotoapparat {

    private String modell;
    private String hersteller;
    public int megapixel;
    private int akkuKapazitaet;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;


    public Fotoapparat(String modell, String hersteller, int megapixel, int akkuKapazitaet) {

        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.akkuKapazitaet = akkuKapazitaet;
        this.objektiv = null;
        this.speicherkarte = null;

    }

    // =================Get und Set =======================

    public String getModell() {
        return "Modell: " + this.modell;
    }

    public String getHersteller() {
        return "Hersteller: " + this.hersteller;
    }

    public int getMegapixel() {
        return this.megapixel;
    }

    public int getAkkuKapazitaet() {
        return this.akkuKapazitaet;
    }


    // ============================"Zusammenbauen"==================================

    public void setObjektiv(Objektiv objektiv) {
        if (this.objektiv == null) {
            this.objektiv = objektiv;
        } else {
            System.out.println("Es ist bereits ein Objektiv montiert!");
        }
    }

    public void resetObjektiv() {
        if (this.objektiv != null) {
            this.objektiv = null;
            System.out.println("Objektiv wurde ausgebaut!");
        } else {
            System.out.println("Es ist kein Objektiv verbaut!");
        }
    }

    public void setSpeicherkarte(Speicherkarte newSpeicherkarte) {
        if (speicherkarte == null) {
            speicherkarte = newSpeicherkarte;
        } else {
            System.out.println("Es ist bereits eine Speicherkarte eingebaut!");
        }
    }

    public void resetSpeicherkarte() {
        if (this.speicherkarte != null) {
            this.speicherkarte = null;
            System.out.println("Speicherkarte wurde ausgebaut!");
        } else {
            System.out.println();
        }
    }

    //========================================Methoden==========================================
    public String toString() {
        return "Angaben zum Produkt: \nModell: " + this.modell + "\nHersteller: " + this.hersteller + " \nMegapixel: " + this.megapixel + " pixel\nAkkukapazitaet: " + this.akkuKapazitaet + " mAh";
    }

    public void takePhoto() {
        Scanner scanner = new Scanner(System.in);
        if (this.objektiv == null) {
            System.out.println("Kein Objektiv vorhanden!");
        } else if (this.speicherkarte == null) {
            System.out.println("Keine Speicherkarte vorhanden!");
        } else {
            if (this.objektiv != null && this.speicherkarte != null) {
                if (this.speicherkarte.savePhotoPossible(this.megapixel)) {
                    System.out.println("Mach ein Foto: (gib einen String ein!)");
                    String photo = scanner.nextLine();
                    this.speicherkarte.savePhoto(this.megapixel, photo);
                    System.out.println("Klick!! Foto gespeichert");
                } else {
                    System.out.println("Speicher voll!");
                }

            }
        }


    }

    public int showPhotoCount() {
        if (this.speicherkarte != null) {
            return this.speicherkarte.showPhotoCount();
        } else {
            System.out.println("Keine Speicherkarte vorhanden!");
        }
        return 0;
    }

    public String showPhotos() {
        if (this.speicherkarte != null) {
            return this.speicherkarte.showPhotos();
        } else {
            System.out.println("Keine Speicherkarte vorhanden!");
        }
        return null;
    }

    public void deletePhotos() {
        if (this.speicherkarte != null) {
            this.speicherkarte.deletePhotos();
        } else {
            System.out.println("Keine Speicherkarte vorhanden!");
        }

    }
}


