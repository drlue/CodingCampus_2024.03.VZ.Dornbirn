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
    public void printStructure(Vector<Guardian> workers){
        System.out.printf("|   ├── Gehege: %s", name);          //
        if (!workers.isEmpty()){                                //
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
        for (Animal a : animalVectorList){
            a.printStructure();
        }
        if (animalVectorList.isEmpty()){
            System.out.println("|       ├── (leer)");
        }
    }
}