package aki.week08.zoo;

import java.util.Vector;

public class Enclosure {
    private String name;
    private Vector<Animal> animalVectorList; //Eine Liste von Tieren wird erstellt

    public Enclosure(String enclosureName) {
        this.name = enclosureName;
        animalVectorList = new Vector<>();
    }

    public void addAnimal(Animal ani) {
        animalVectorList.add(ani);
    }

    //Get Enclosure
    public String getName() {
        return name;
    }


    //Wird in Zoo aufgerufen
    public void printStructure() {
        System.out.printf("│   ├──  Gehege: %s%n", name);
        for (Animal a : animalVectorList) {
            a.printStructure();
        }
    }
}