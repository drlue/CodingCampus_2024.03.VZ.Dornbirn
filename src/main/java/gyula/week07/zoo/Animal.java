package gyula.week07.zoo;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }


    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void printStructure(){
        System.out.printf("|       |-- %s, %s%n", name, species);
    }
}
