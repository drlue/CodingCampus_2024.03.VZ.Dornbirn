package aki.week08.zoo;

import java.util.Vector;

public class Enclosure {
    private String name;

    private Vector<Animal> animalsArrayList;

    public Enclosure(String enclosureName) {
        this.name = enclosureName;
        animalsArrayList = new Vector<>();
    }

    public void addAnimal(Animal ani) {
        animalsArrayList.add(ani);
    }

    //Get Enclosure
    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.printf("│   ├──  Gehege: %s%n", name);
        for (Animal a : animalsArrayList) {
            a.printStructure();
        }
    }
}
