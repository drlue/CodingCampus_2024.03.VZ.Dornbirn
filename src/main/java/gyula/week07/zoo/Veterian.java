package gyula.week07.zoo;

import ardijanla.ConsoleColors;

public class Veterian {
    private String name;

    public Veterian(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void heal(Animal animal){
        animal.healed(this);
    }
}
