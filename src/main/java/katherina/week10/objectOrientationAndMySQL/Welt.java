package katherina.week10.objectOrientationAndMySQL;

public class Welt {
    private String name;

    public Welt(String name){
        this.name=name;
    }

    public void printStructure() {
        System.out.printf("├── %s %n", name);

    }
}
