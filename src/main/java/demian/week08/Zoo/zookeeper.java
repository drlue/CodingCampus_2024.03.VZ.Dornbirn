package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class zookeeper {
    private String name;
    private Vector<Gehege> responsabilities;

    public zookeeper(String name){
        this.name = name;
        responsabilities = new Vector<>();

    }

    public void addresp(Gehege gehege){
        responsabilities.add(gehege);
    }

    public void verantwortungsEntzug(Gehege gehege) {
        responsabilities.remove(gehege);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder verantworungsbereich = new StringBuilder();
        for (Gehege elemente : responsabilities){
            verantworungsbereich.append("\n").append("|    --").append(elemente);
        }
            String formatted = String.format("|-- %sPfleger%s: " + name +
                    "\n|-- Zuständig für:" + verantworungsbereich, ConsoleColors.BLUE, ConsoleColors.RESET);
            return formatted;
    }
}
