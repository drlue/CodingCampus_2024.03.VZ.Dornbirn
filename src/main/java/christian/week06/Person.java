package christian.week06;

public class Person {
    private String name;
    private int groesseInZentimeter;
    private int alterInJahren;
    private int gewichtInKilogramm;

    public Person(String name, int groesse, int alter, int gewicht) {
        this.name = name;
        this.groesseInZentimeter = groesse;
        this.alterInJahren = alter;
        this.gewichtInKilogramm = gewicht;
    }

    public String toString() {
        return "Angaben zur Person:\nName: " + this.name + "\nGroesse: " + this.groesseInZentimeter + " cm\nAlter: " + this.alterInJahren + " Jahre\nGewicht: " + this.gewichtInKilogramm + " kg";
    }

}
