package christian.week06.fotoapparatPackage;

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
    }

    public String getModell() {
        return "Modell: " + this.modell;
    }

    public void setModell(String newModell) {
        if (newModell.length() > 0) {
            this.modell = newModell;
        } else {
            System.out.println(newModell + " ist keine gültige Eingabe!");
        }

    }

    public String getHersteller() {
        return "Hersteller: " + this.hersteller;
    }

    public void setHersteller(String newHersteller) {
        if (newHersteller.length() > 0) {
            this.hersteller = newHersteller;
        } else {
            System.out.println(newHersteller + " ist keine gültige Eingabe!");
        }

    }

    public int getMegapixel() {
        return this.megapixel;
    }

    public void setMegapixel(int newMegapixel) {
        if (newMegapixel > 0) {
            this.megapixel = newMegapixel;
        } else {
            System.out.println(newMegapixel + " ist keine gültige Eingabe!");
        }
    }

    public int getAkkuKapazitaet() {
        return this.akkuKapazitaet;
    }

    public void setAkkuKapazitaet(int newAkkukapazitaet) {
        if (akkuKapazitaet > 0) {
            this.akkuKapazitaet = newAkkukapazitaet;
        } else {
            System.out.println(newAkkukapazitaet + "ist keine gültige Eingabe!");
        }
    }

    public String toString() {
        return "Angaben zum Produkt: \nModell: " + this.modell + "\nHersteller: " + this.hersteller + " \nMegapixel: " + this.megapixel + " pixel\nAkkukapazitaet: " + this.akkuKapazitaet + " mAh";
    }

    public void takePhoto() {
        if (speicherkarte.safePhoto(this.megapixel) == true) {
            speicherkarte.safePhoto(this.megapixel);
            System.out.println("Klick!! Foto gespeichert");
        } else {
            System.out.println("Speicher voll!");
        }
    }
}


