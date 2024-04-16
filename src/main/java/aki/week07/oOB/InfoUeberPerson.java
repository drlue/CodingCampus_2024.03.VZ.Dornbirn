package aki.week07.oOB;


public class InfoUeberPerson {
    private int height;
    private int age;
    private String name;
    private int weight;

    public InfoUeberPerson(int height, int age, String name, int weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "InfoUeberPerson{" +
                "height=" + height +
                ", age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                '}';
    }
}