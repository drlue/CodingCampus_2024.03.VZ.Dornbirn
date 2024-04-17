package samet.week07.ZooSimulation;

public class Animal {

    private String name;
    private String species;
    private String food;
    private int units;
    private float foodprice;




    public Animal(String name, String species,String food, int units ,float foodprice) {

        this.name = name;
        this.species = species;
        this.food = food;
        this.units = units;
        this.foodprice = foodprice;



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


