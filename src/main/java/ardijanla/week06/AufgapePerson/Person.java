package ardijanla.week06.AufgapePerson;

public class Person {
    int height;
    int age;
    String name;
    float weight;


    public Person(int height, int age, String name, float weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }


    public String toString() {


        String beautyString =
                        "Name: " + name + "\n" +
                        "alter: " + age + "jahre\n" +
                        "gewicht: " + weight + "kg\n" +
                        "groeße: " + height + "cm\n";

        return beautyString;
    }


}
