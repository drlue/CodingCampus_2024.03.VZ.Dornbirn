package irem.ZooNew;

public class Animal {
    private String name;
    private String species;
    private Feed feed;
    private double feedAmount;
    private int health;
    private int maxHealth;
    private int biteForce;


    public Animal(String name, String species, Feed feed, double feedAmount,int maxHealth, int biteForce) {
        this.name = name;
        this.species = species;
        this.feed = feed;
        this.feedAmount = feedAmount;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.biteForce = biteForce;
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
    public boolean isAlive() {
        return health > 0;
    }
    public void receiveDamage(int damage) {
        if (isAlive()) {
            health -= damage;
            System.out.println(name + " (" + species + ") wurde gebissen und hat jetzt " + health + " Gesundheit.");
        }
    }
    public void attemptToBite(Animal other) {
        if (isAlive() && Math.random() < 0.4) {
            other.receiveDamage(biteForce);
        }
    }
    public void checkHealth() {
        if (health <= 0) {
            System.out.println(name + " (" + species + ") ist gestorben.");
        }
    }


}
