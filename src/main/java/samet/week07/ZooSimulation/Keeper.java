package samet.week07.ZooSimulation;

import ardijanla.ConsoleColors;
import java.util.ArrayList;
import java.util.List;

public class Keeper {

    private String name;
    private String favoriteAnimal;
    private List<Enclosure> tasks;


    public Keeper(String name,String favoriteAnimal){
        this.name = name;
        this.favoriteAnimal = favoriteAnimal;
        tasks = new ArrayList<>();
    }

    public void addTask(Enclosure enclosure){
        if (!tasks.contains(enclosure)) {
            tasks.add(enclosure);
        }
    }

    public boolean isResponsibleFor(Enclosure enclosure){
        return tasks.contains(enclosure);
    }

    public String getName(){
        return name;
    }

    public String getFavoriteAnimal(){
        return favoriteAnimal;
    }

    public void printZooStructure() {
        System.out.println("|   |-- Keeper: " + name);
        for (int i = 0; i < tasks.size(); i++) {
            if (i == 0) {
                System.out.print("|       Responsible for: ");
            } else {
                System.out.print(", ");
            }
            System.out.print(tasks.get(i).getName());
            if (i == tasks.size() - 1) {
                System.out.print("");
            }
        }
        System.out.println();
    }

    public void simulatedDay(){
        System.out.printf("%s%s%s start working...%n", ConsoleColors.BLUE, name, ConsoleColors.RESET);
        for (Enclosure enclosure : tasks){
            enclosure.doClean(this);
            enclosure.watchRandomAnimal(this);
        }
    }

    }


