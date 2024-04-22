package ardijanla.week07.zoo007;

import ardijanla.ConsoleColors;

public class Animal {
    String name;
    String species;
    FoodRequirement foodRequirement;

    private int health;
    private int maxHealth;
    private int bite;

    public Animal(String name, String species, Food food, double amount, int maxHealth, int bite) {
        this.name = name;
        this.species = species;
        this.foodRequirement = new FoodRequirement(food, amount);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.bite = bite;
    }

    @Override
    public String toString() {
        return name + ", " + species;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void bite(Animal victim) {
        if (victim != null) {
            // Aktualisiere die Gesundheit des Opfers nach dem Angriff


            // Farbige Ausgabe für den Angreifer
            System.out.printf("%n%sAggressor:%s %s%n", ConsoleColors.RED, ConsoleColors.RESET, this.name);
            System.out.printf("%sHealth:%s %d%n", ConsoleColors.GREEN, ConsoleColors.RESET, this.health);

            // Farbige Ausgabe für das Opfer
            System.out.printf("%n%sVictim:%s %s%n", ConsoleColors.YELLOW, ConsoleColors.RESET, victim.name);
            System.out.printf("%sHealth:%s %d%n", ConsoleColors.GREEN, ConsoleColors.RESET, victim.health);

            victim.health = Math.max(0, victim.health - this.bite);

            // Verhindere negative Gesundheitswerte
            if (victim.health == 0) {
                System.out.printf("%s was killed by %s%n", victim.name, this.name);
            } else {
                // Details zum Angriff
                System.out.printf("%n%s%s Attacks %s%n%s%s Lost %d Health.%nRemaining Health %d%n%s",
                        ConsoleColors.RED, this.name, victim.name,
                        ConsoleColors.YELLOW, victim.name, this.bite, victim.health,ConsoleColors.RESET);
            }


        }
    }

    public String getName() {
        return name;
    }

    public void care(Keeper keeper){
        if (health > 0) {
            System.out.printf("%s%s%s %sfüttert%s %s mit %s%s%s %s %s %n", ConsoleColors.RED, keeper.getName(), ConsoleColors.RESET, ConsoleColors.BLUE, ConsoleColors.RESET, this, ConsoleColors.RED, foodRequirement.amount, ConsoleColors.RESET, foodRequirement.food.unit, foodRequirement.food.name);

        } else {
            System.out.println(name + "Tier isch tot scheiße");
        }
    }

}

