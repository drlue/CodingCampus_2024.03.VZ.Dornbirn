package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Gehege {
    private String name;
    private Vector<Tier> tierliste;

    public Gehege(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein");
        } else {
            this.name = name;
            tierliste = new Vector<>();
        }
    }

    // =========== FUNKTIONEN ============
    public void addAnimal(Tier tier){
        this.tierliste.add(tier);
    }

    public void printAnimals(){
        for(Tier element : tierliste){
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        StringBuilder Tiere = new StringBuilder();
        for (Tier element : tierliste){
            Tiere.append("\n").append("|-------->").append(element);
        }
        String formatted = String.format("%sGehege: " + name + "%s" + Tiere , ConsoleColors.CYAN_BOLD, ConsoleColors.RESET);
        return formatted;
    }
}
