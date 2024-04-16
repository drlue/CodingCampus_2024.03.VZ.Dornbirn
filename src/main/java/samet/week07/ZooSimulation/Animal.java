package samet.week07.ZooSimulation;

public class Animal {

    private String name;
    private String species;



    public Animal(String name, String species) {

        this.name = name;
        this.species = species;

    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }


    public void printZooStructure(){
        System.out.printf("|       |-- %s, %s%n", name, species);
    }




    }


