package samet.week06.Person;

public class Person {

    private int size;
    private int age;
    private String name;
    private double weight;

    public Person(int size, int age, String name, double weight) { //Constructor
        this.size = size;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() { //to String damit die Ausgabe schön aussieht!
        return
                "Name: " + name + "\n" +
                        "Alter: " + age + " Jahre" +"\n" +
                        "Größe: " + size + " cm\n" +
                        "Gewicht: " + weight + " kg\n";
    }
}
