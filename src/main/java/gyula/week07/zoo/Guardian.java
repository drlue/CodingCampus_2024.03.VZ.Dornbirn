package gyula.week07.zoo;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Guardian {
    private String name;
    private String favoriteSpecies;
    private Vector<Enclosure> tasks;

    public Guardian(String name, String favoriteSpecies) {
        this.name = name;
        this.favoriteSpecies = favoriteSpecies;
        tasks = new Vector<>();
    }

    public void addTask(Enclosure enc) {
        if (!tasks.contains(enc)) {
            tasks.add(enc);
        }
    }

    public boolean isResponsibleFor(Enclosure enc){
        return tasks.contains(enc);
    }

    public String getFavoriteSpecies() {
        return favoriteSpecies;
    }

    public void printStructure() {
        System.out.printf("|   |-- Pfleger: %s", name);
        for (int i = 0; i < tasks.size(); i++) {
            if (i == 0){
                System.out.printf(" (Zustaendig fuer: ");
            } else {
                System.out.printf(", ");
            }
            System.out.print(tasks.get(i).getName());
            if (i == tasks.size() - 1){
                System.out.print(")");
            }
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void simulateDay(){
        System.out.printf("%s%s%s start working...%n", ConsoleColors.BLUE, name, ConsoleColors.RESET);
        for (Enclosure enc: tasks){
            enc.doClean(this);
            enc.watchRandomAnimal(this);
        }
    }
}
