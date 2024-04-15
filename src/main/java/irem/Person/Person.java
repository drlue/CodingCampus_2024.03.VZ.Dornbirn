package irem.Person;

public class Person {

    private String name;
    private int alter;
    private double groesse; // in Metern
    private double gewicht; // in Kilogramm

    public Person(String name, int alter, double groesse, double gewicht) {
        this.name = name;
        this.alter = alter;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public int getAlter() {
        return alter;
    }

    public double getGroesse() {
        return groesse;
    }

    public double getGewicht() {
        return gewicht;
    }
}
