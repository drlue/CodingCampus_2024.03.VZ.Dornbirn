package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Keeper {

    private String name;
    private Vector<Enclosure> enclosures;
    private Vector<Enclosure> remainingEnclosures;

    private Status status;

    private static enum Status {
        LOOKING_FOR_WORK,
        WORKING,
        WATCHING,
        IDLE
    }

    private int duration;
    private String favSpecies;
    private boolean hasFinished;
    private Enclosure activeEnclosure;

    //---constructor
    public Keeper(String name, String favSpecies) {
        this.name = name;
        this.favSpecies = favSpecies;
        duration = 0;
        enclosures = new Vector<>();
        remainingEnclosures = new Vector<>();
        status = Status.LOOKING_FOR_WORK;
        hasFinished = false;

    }

    //---get/set---

    public String getName() {
        return name;
    }


    //---methods---
    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public boolean isResponsibleForEnclosure(Enclosure enclosure) {
        if (enclosures.contains(enclosure)) {
            return true;
        }
        return false;
    }

    public String getColoredName(String color) {
        return color + name + ConsoleColors.RESET;
    }
    public String getColoredName() {
        return getColoredName(ConsoleColors.GREEN);
    }

    // -------------------------------SIMULATION 0.1 -------------------------------
    public void activitySim1(int hour) {

        switch (status) {
            case LOOKING_FOR_WORK -> {
                if (hour == 8) {
                    //System.out.printf("%d Uhr: %s beginnt den Arbeitstag mit einem Kaffee.%n", hour, getColoredName(ConsoleColors.GREEN));
                    status = Status.WORKING;
                }

            }
            case WORKING -> {
                if (hasWorkLeft()) {
                    System.out.printf("%d Uhr: %s beginnt in Gehege %s zu arbeiten.%n", hour, getColoredName(), activeEnclosure.getColoredName());
                    duration = Zoo.random.nextInt(1, 4);
                    activeEnclosure.workInEnclosure(this, duration);
                    activeEnclosure.setFinished(true);
                    status = Status.WATCHING;
                } else {
                    status = Status.IDLE;
                }
            }
            case WATCHING -> {
                --duration;
                if (duration <= 0) {
                    activeEnclosure.printAnimalList();
                    watchAnimalInEnclosure(hour);
                    if (!remainingEnclosures.isEmpty()) {
                        status = Status.WORKING;
                    } else {
                        status = Status.IDLE;
                    }
                }
            }
            case IDLE -> {
                if (hour == 17) {
                    System.out.printf("%d Uhr: %s hat seine Arbeit getan und geht nach Hause%n", hour, getColoredName());
                    status = Status.LOOKING_FOR_WORK;
                }
            }
        }
    }

    private void watchAnimalInEnclosure(int hour) {
        System.out.printf("%d Uhr: %s hat Arbeit in Gehege %s beendet und ", hour, getColoredName(), activeEnclosure.getColoredName());
        Animal activeAnimal = activeEnclosure.getRandomAnimal();
        if (activeAnimal != null) {
            if (activeAnimal.getSpecies().equals(favSpecies)) {

                System.out.printf("%sbewundert%s nun %s.%n",  ConsoleColors.YELLOW, ConsoleColors.RESET, activeAnimal.getColoredName());
            } else {
                System.out.printf("betrachtet nun %s.%n",  activeAnimal.getColoredName());
            }
        }
    }

    public void reset() {
        status = Status.LOOKING_FOR_WORK;
        remainingEnclosures = new Vector<>(enclosures);
    }


    private boolean hasWorkLeft() {
        boolean hasWorkLeft = false;
        while (!hasWorkLeft && !remainingEnclosures.isEmpty()) {
            Enclosure enc = remainingEnclosures.remove(Zoo.random.nextInt(remainingEnclosures.size()));
            if (!enc.isFinished()) {
                activeEnclosure = enc;
                hasWorkLeft = true;
            }
        }
        return hasWorkLeft;
    }


//--- print functions

    public void printKeeper() {
        System.out.print(name);
    }


}
