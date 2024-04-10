package aki.week07.foto;

import ardijanla.ConsoleColors;

public class Fotoapparat {
    private String model;
    private String hersteller;
    private double megapixel;
    private String farbe;

    public Fotoapparat(String model, String hersteller, double megapixel, String farbe){
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.farbe = farbe;
    }

                                            // Getter und Setter für Hersteller
    public String getHersteller(){
        return hersteller;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

                                            //Getter und Setter für die Model
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

                                            //Getter und Setter für Megapixel
    public double getMegapixel() {
        return megapixel;
    }
    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }

                                            //Getter und Setter für Farbe
    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    //Fotographieren
    public void takeFoto(){
        System.out.println("Foto wurde mit " + model +" aufgenommen und das Foto hat " + megapixel + " Megapixel.");
    }

    public String toString(){
        return String.format("%-16s: %s%n%-16s: %s%nMegapixel: %.1f%nFarbe: %s%s%s", "Hersteller", hersteller, "Model", model, megapixel, ConsoleColors.BLUE, farbe, ConsoleColors.RESET);
    }
}
