package ardijanla.week06.Person2;

public class Person {

    private String name;
    private int height;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(String name, int height, int age, double weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }
}
