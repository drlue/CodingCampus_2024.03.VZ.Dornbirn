package samet.week06.PersonList;

import java.util.List;

public class PersonInfos {

    private int size;
    private int age;
    private String name;
    private double weight;

    public PersonInfos(int size, int age, String name, double weight) {

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
        return String.format("%-12s (%2d) %8.1f kg / %3d cm", name, age, weight, size);

    }
}
















