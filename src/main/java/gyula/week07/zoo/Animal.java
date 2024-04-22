package gyula.week07.zoo;

import ardijanla.ConsoleColors;

public class Animal {
    private String name;
    private String species;

    private int health;
    private int healthMax;
    private int attack;

    public Animal(String name, String species, int healthMax, int attack){
        this.name = name;
        this.species = species;
        this.health = healthMax;
        this.healthMax = healthMax;
        this.attack = attack;
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

    public boolean isDead(){
        return health <= 0;
    }

    public float getRelativeHealth(){
        return health / (float)healthMax;
    }

    public void healed(Veterian vet){
        float healPower = Zoo.random.nextFloat(1.3f, 2.0f);
        int newHealth = Math.min(healthMax, (int)(health * healPower));
        if (health != newHealth) {
            System.out.printf("%s%s%s heals %s%s%s (%d -> %d).%n",
                    ConsoleColors.YELLOW_BRIGHT, vet.getName(), ConsoleColors.RESET,
                    ConsoleColors.RED, name, ConsoleColors.RESET,
                    health, newHealth
            );
        } else {
            System.out.printf("%s%s%s has nothing to do and makes a coffee break.%n",
                    ConsoleColors.YELLOW_BRIGHT, vet.getName(), ConsoleColors.RESET
            );
        }
        health = newHealth;
    }

    public void bite(Animal victom){
        if (victom.health > 0 && this.health > 0) {
            victom.health = Math.max(0, victom.health - this.attack);
            if (victom.health > 0) {
                System.out.printf("%s%s%s has been biten by %s%s%s. %d health remains.%n",
                        ConsoleColors.RED, victom.name, ConsoleColors.RESET,
                        ConsoleColors.RED, this.name, ConsoleColors.RESET,
                        victom.health
                );
            } else {
                System.out.printf("%s%s%s has been biten by %s%s%s. R.I.P %s%s%s.%n",
                        ConsoleColors.RED, victom.name, ConsoleColors.RESET,
                        ConsoleColors.RED, this.name, ConsoleColors.RESET,
                        ConsoleColors.RED, victom.name, ConsoleColors.RESET
                );
            }
        }
    }
}
