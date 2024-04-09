package demian.week07.day02.Fotoapparat;

public class Fotoapparat {

    //Attribute: Brennweite min/max, Model, Hersteller und Megapixel.
    private float brennweiteMinMax;
    private String Model;
    private String Hersteller;
    private int megapixel;

    private Objektiv objektiv;

    private boolean MemoryCardInserted;
    private boolean ObjectiveInserted;

    //Konstruktor:
    public Fotoapparat(String model, String hersteller, int megapixel, Objektiv objektiv){
        Model = model;
        Hersteller = hersteller;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
    }

    //Erstelle für die Attribute getter und setter
    //GETTER

    public int getMegapixel() {
        return megapixel;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public String getModel() {
        return Model;
    }

    //SETTER

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void takePhotoOfShep() {
        if (this.MemoryCardInserted) {
            System.out.println("▕▔▔╲╱▔▔▔╲╱▔▔▏\n" +
                    "┈╲＿╱╰╮┈╭╯╲＿╱\n" +
                    "┈┈┈▏▉╮┈╭▉▕\n" +
                    "┈┈╱╲╰╰┊╯╯╱╲\n" +
                    "┈╱╰▕╰╰┳╯╯▏╯╲\n" +
                    "▕╰╰╰╲╰┻╯╱╯╯╯▏\n" +
                    "▕╰╰╰╰▔▔▔╯╯╯╯▏\n" +
                    "▕╰╰╰╰╰╮╭╯╯╯╯▏\n" +
                    "┈╲╭╮┈╰╮╭╯╭╮╱\n" +
                    "┈┈┫┣╭━━━╮┫┃\n" +
                    "┈┈┃┃┃┈┈┈┃┃┃\n" +
                    "┈┈┗┛┛┈┈┈┗┗┛");
        } else {
            System.out.println("No memory card inserted");
        }
    }


    //Überschreibe die toString() Methode und gib die relevanten Daten als String zurück


    @Override
    public String toString() {
        return "Kameradaten: "
                + Hersteller +  Model
                + "\n___________"
                + "\nModel: " + Model
                + "\nHersteller: " + Hersteller
                + "\nMegapixel: " + megapixel
                + "\n";
    }
}
