package samet.week07.ZooSimulation;


import java.util.ArrayList;
import java.util.List;

public class Keeper {

    private String name;
    private List<Enclosure> tasks;


    public Keeper(String name){
        this.name = name;
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

    public void printZooStructure(){
        System.out.println("|   |-- Pfleger: " + name);
        for (int i = 0; i < tasks.size(); i++) {
            if (i == 0){
                System.out.print("|       Zuständig für:");
            } else {
            System.out.print(", ");
        }
        System.out.print(tasks.get(i).getName());
        if (i == tasks.size() - 1){
            System.out.print("");
        }
    }
        System.out.println();

        }

    }

