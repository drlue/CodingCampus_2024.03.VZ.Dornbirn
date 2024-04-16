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

    public void printStructure(Vector<Guardian> workers){
        System.out.printf("|   |-- Gehege: %s", name);
        if (!workers.isEmpty()){
            System.out.print(" (Pfleger: ");
            for (int i = 0; i < workers.size(); i++) {
                if (i > 0){
                    System.out.print(", ");
                }
                System.out.print(workers.get(i).getName());
            }
            System.out.println(")");
        } else {
            System.out.println(" !!! VORSICHT, kein zustaendiger Pfleger wurde identifiziert.");
        }
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
