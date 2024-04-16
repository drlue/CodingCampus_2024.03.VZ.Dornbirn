package gyula.week07.zoo;

import java.util.Vector;

public class Guardian {
    private String name;
    private Vector<Enclosure> tasks;

    public Guardian(String name) {
        this.name = name;
        tasks = new Vector<>();
    }

    public void addTask(Enclosure enc) {
        if (!tasks.contains(enc)) {
            tasks.add(enc);
        }
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
}
