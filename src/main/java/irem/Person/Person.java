package irem.Person;

public class Person {

    private int groesse; // in cm
    private int alter; // in Jahren
    private String name;
    private int gewicht; // in kg

    // Konstruktor
    public Person(String name, int alter, int groesse, int gewicht) {
        this.name = name;
        this.alter = alter;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    // toString()-Methode
    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Alter=" + alter +
                ", Größe=" + groesse + " cm" +
                ", Gewicht=" + gewicht + " kg" +
                '}';
    }

    // Getter und Setter Methoden
    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

}
