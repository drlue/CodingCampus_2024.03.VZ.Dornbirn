package irem.ZooNew;

public class Animal {
    private String name;
    private String species;
    private Feed feed;
    private double feedAmount;



    public Animal(String name, String species, Feed feed, double feedAmount) {
        this.name = name;
        this.species = species;
        this.feed = feed;
        this.feedAmount = feedAmount;
    }

    public String getSpecies(){
        return this.species;
    }
    public void printNameAndSpecies() {
        System.out.println("│       |-- " + name + ", " + species + ","+ feed);
    }

    public String getName() {
        return name;
    }
}
