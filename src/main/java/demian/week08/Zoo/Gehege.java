package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.Random;
import java.util.Vector;

public class Gehege {
    private String name;
    private Vector<Tier> tierliste;
    private boolean gepflegt;

    // ======== KONSTRUKTOR ===========
    public Gehege(String name) {
        this.name = name;
        this.tierliste = new Vector<>();
        this.gepflegt = false;
    }

    // ========== SETTER / GETTER ========


    public void setGepflegt(boolean gepflegt) {
        this.gepflegt = gepflegt;
    }

    public Vector<Tier> getTierliste() {
        return tierliste;
    }

    public String getName() {
        return name;
    }

    public boolean isGepflegt() {
        return gepflegt;
    }

    // =========== FUNKTIONEN ============
    public void addAnimal(Tier tier) {
        this.tierliste.add(tier);
    }

    public void printAnimals() {
        for (Tier element : tierliste) {
            System.out.println(element);
        }
    }

    public void removeDeadAnimals() {
        int counter = 0;
        for (int i = 0; i < tierliste.size() - counter; i++) {
            if (tierliste.get(i).getCurrentHealth() <= 0) {
                counter++;
                System.out.printf("%sLeider ist %s gestorben und musste beerdigt werden.%s%n", ConsoleColors.RED, tierliste.get(i).getName(), ConsoleColors.RESET);
                System.out.println("               ...\n" +
                        "             ;::::;\n" +
                        "           ;::::; :;\n" +
                        "         ;:::::'   :;\n" +
                        "        ;:::::;     ;.\n" +
                        "       ,:::::'       ;           OOO\\\n" +
                        "       ::::::;       ;          OOOOO\\\n" +
                        "       ;:::::;       ;         OOOOOOOO\n" +
                        "      ,;::::::;     ;'         / OOOOOOO\n" +
                        "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                        "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                        " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                        ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                        ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                        "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                        "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                        " :::`:::::::`;; ;:::::::::##                OO\n" +
                        " ::::`:::::::`;::::::::;:::#                OO\n" +
                        " `:::::`::::::::::::;'`:;::#                O\n" +
                        "  `:::::`::::::::;' /  / `:#\n" +
                        "   ::::::`:::::;'  /  /   `#");
                tierliste.remove(tierliste.get(i));
            }

        }
    }

    public void removeDeadAnimal() {
        for (Tier animal : tierliste) {
            if (animal.getCurrentHealth() <= 0) {
                tierliste.remove(animal);
                System.out.printf("%sLeider ist %s gestorben und musste beerdigt werden.%s%n", ConsoleColors.RED, animal.getName(), ConsoleColors.RESET);
                System.out.println("               ...\n" +
                        "             ;::::;\n" +
                        "           ;::::; :;\n" +
                        "         ;:::::'   :;\n" +
                        "        ;:::::;     ;.\n" +
                        "       ,:::::'       ;           OOO\\\n" +
                        "       ::::::;       ;          OOOOO\\\n" +
                        "       ;:::::;       ;         OOOOOOOO\n" +
                        "      ,;::::::;     ;'         / OOOOOOO\n" +
                        "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                        "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                        " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                        ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                        ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                        "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                        "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                        " :::`:::::::`;; ;:::::::::##                OO\n" +
                        " ::::`:::::::`;::::::::;:::#                OO\n" +
                        " `:::::`::::::::::::;'`:;::#                O\n" +
                        "  `:::::`::::::::;' /  / `:#\n" +
                        "   ::::::`:::::;'  /  /   `#");
            }
        }
    }

    public void fight() {
        // Alle Tiere des Geheges durchgehen
        for (Tier tier : tierliste) {
            //Check ob der angreifer noch lebt
            if (tier.getCurrentHealth() > 0) {
                // Wahrscheinlichkeit von 40% erzeugen
                Random rand = new Random();
                int zahl = rand.nextInt(0, 10);
                if (zahl > 6) {
                    // Wenn die wahrscheinlichkeit von 40% eingetreten ist beisst das tier ein anderes Tier aus dem Gehege
                    // Random Tier aus gehege mittels Zufallszahl auswählen welches attackiert werden soll
                    int zahl2 = rand.nextInt(0, tierliste.size());

                    // Das Tier kann sich natürlich nicht selber attackieren, sondern nur andere
                    if (tier == tierliste.get(zahl2)) {
                        System.out.printf("%s --> %s%s ist verwirrt und versucht sich selbst zu attackieren.%s%n", ConsoleColors.BLUE_BOLD, tier.getName(), ConsoleColors.BLUE, ConsoleColors.RESET);
                    } else {
                        // Wenn der Attackierte Mickey ist
                        if (tierliste.get(zahl2).getName().equals("Mickey")) {
                            System.out.printf("%s %s versucht Mickey zu beissen, aber der Flinke Mickey flitzt davon%n",tier.getName(), tier.getGattung());
                            System.out.println("             (\\-.\n" +
                                    "             / _`> .---------.\n" +
                                    "     _)     / _)=  |'-------'|\n" +
                                    "    (      / _/    |O   O   o|\n" +
                                    "jgs  `-.__(___)_   | o O . o |\n" +
                                    "                   `---------'");
                        } else {
                            System.out.printf("%s ==> %s %s attackiert %s %s%s%n", ConsoleColors.RED_BOLD, tier.getName(), tier.getGattung(), tierliste.get(zahl2).getName(), tierliste.get(zahl2).getGattung(), ConsoleColors.RESET);
                            // Das Random Tier das attackiert wird, erleidet Schaden in höhe der "Bite-Strength" vom attackierenden Tier
                            tierliste.get(zahl2).setCurrentHealth(tier.getBiteStrength());
                            System.out.printf("%s%s Leben fällt um %s Biss-schaden auf %s Leben%s%n", ConsoleColors.RED, tierliste.get(zahl2).getName(), tier.getBiteStrength(), tierliste.get(zahl2).getCurrentHealth(), ConsoleColors.RESET);
                        }
                    }
                }
            }
        }

        // Check ob ein Tier gestorben ist
        removeDeadAnimals();
    }


    @Override
    public String toString() {
        StringBuilder Tiere = new StringBuilder();
        for (Tier element : tierliste) {
            Tiere.append("\n").append("|-------->").append(element);
        }
        String formatted = String.format("%sGehege: " + name + "%s" + Tiere, ConsoleColors.CYAN_BOLD, ConsoleColors.RESET);
        return formatted;
    }
}
