package irem.Person;

public class PersonMitVektor {
    private String name;
    private int age;
    private double height; // Größe in Metern
    private double weight; // Gewicht in Kilogramm

    // Konstruktor
    public PersonMitVektor(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getter Methoden
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

