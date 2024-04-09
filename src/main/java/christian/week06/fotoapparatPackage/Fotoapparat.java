package christian.week06.fotoapparatPackage;

import java.util.Scanner;

public class Fotoapparat {

    private String modell;
    private String hersteller;
    public int megapixel;
    private int akkuKapazitaet;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;
    private Scanner scanner;


    public Fotoapparat(String modell, String hersteller, int megapixel, int akkuKapazitaet, Scanner sc) {

        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.akkuKapazitaet = akkuKapazitaet;
        this.objektiv = null;
        this.speicherkarte = null;
        this.scanner = sc;
    }

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

    public String toString() {
        return "Angaben zum Produkt: \nModell: " + this.modell + "\nHersteller: " + this.hersteller + " \nMegapixel: " + this.megapixel + " pixel\nAkkukapazitaet: " + this.akkuKapazitaet + " mAh";
    }

    public void takePhoto() {
        if (this.speicherkarte.safePhotoPossible(this.megapixel) && this.objektiv != null) {
            this.speicherkarte.safePhoto(this.megapixel, scanner.nextLine());
            System.out.println("Klick!! Foto gespeichert");
        } else {
            System.out.println("Speicher voll!");
        }
    }

    public int showPhotoCount() {

        return speicherkarte.showPhotoCount();

    }

    public String showPhotos() {
        return speicherkarte.showPhotos();
    }
}


