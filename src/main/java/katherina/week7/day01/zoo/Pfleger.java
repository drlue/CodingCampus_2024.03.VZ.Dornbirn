package katherina.week7.day01.zoo;

import java.util.Vector;

public class Pfleger {

    private String name;
    private String liebling;
    private Zoo zoo;

    private Vector<Gehege> bereich;

    public Pfleger(String name, String liebling) {
        this.name = name;
        this.liebling = liebling;
        bereich = new Vector<>();
    }

    public void addBereich(Gehege gehege) {
        if (!bereich.contains(gehege)) {
            bereich.add(gehege);
        }
    }

    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean zustaendigkeit(Gehege gehege) {
        return bereich.contains(gehege);
    }

    public String getLiebling() {
        return liebling;
    }


    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.printf("│  ├── heute im Dienst: %s", name);
        for (int index = 0; index < bereich.size(); index++) {
            if (index == 0) {
                System.out.print(" (zuständig für: ");
            } else {
                System.out.print(", ");
            }
            System.out.print(bereich.get(index).getName());
            if (index == bereich.size() - 1) {
                System.out.print(")");
            }
        }
        System.out.println();
    }

    public void simulateDay(){
        System.out.printf("%s beginnt den Arbeitstag.%n", name);
        for (Gehege gehege: bereich){
            gehege.putzkolonne(this);
            gehege.zufallstierBegucken(this);
        }
        System.out.printf("%s ist fertig und geht nach Hause.%n",name);
    }
}

