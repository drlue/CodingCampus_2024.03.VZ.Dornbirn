package gyula.week07.zooWithTick;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Guardian {
    private String name;
    private String favoriteSpecies;
    private Vector<Enclosure> tasks;
    private Vector<Enclosure> tasksLeft;
    private int timeToLeft;


    public Guardian(String name, String favoriteSpecies) {
        this.name = name;
        this.favoriteSpecies = favoriteSpecies;
        tasks = new Vector<>();
        tasksLeft = new Vector<>();
        timeToLeft = 0;
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


    public boolean hasWorkLeft(){
        return !tasksLeft.isEmpty();
    }
    public void initDay(){
        tasksLeft = new Vector<>(tasks);
    }

    public void tick(){
        if (timeToLeft <= 0) {
            if (!tasksLeft.isEmpty()) {
                Enclosure currentTask = tasksLeft.remove(Zoo.random.nextInt(tasksLeft.size()));
                currentTask.doClean(this);
                currentTask.watchRandomAnimal(this);
                timeToLeft = Zoo.random.nextInt(10);
            }
        } else {
            --timeToLeft;
        }
    }
}
