package gyula.week07.zoo;

import java.util.Vector;

public class Enclosure {
    private String name;
    private Vector<Animal> animalList;

    public Enclosure(String name){
        this.name = name;
        animalList = new Vector<>();
    }

    public void addAnimal(Animal ani){
        animalList.add(ani);
    }

    public void printStructure(){
        System.out.printf("|   |-- Gehege: %s%n", name);
        for (Animal a : animalList){
            a.printStructure();
        }
        if (animalList.isEmpty()){
            System.out.println("|       |-- (leer)");
        }
    }

    public String getName() {
        return name;
    }
}
