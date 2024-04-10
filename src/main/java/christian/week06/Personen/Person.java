package christian.week06.Personen;

public class Person {
    private String name;
    private int size;
    private int age;
    private int weight;

    public Person(String name, int size, int age, int weight) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Name: " + getName() + "\nSize: " + getSize() + "\nAge: " + getAge() + "\nWeight: " + getWeight();
    }
}
