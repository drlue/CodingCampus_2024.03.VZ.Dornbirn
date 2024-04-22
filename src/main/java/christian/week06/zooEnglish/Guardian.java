package christian.week06.zooEnglish;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Guardian {
    private String name;
    private Enclousure workingEnc;

    private int hourForWork;

    private String favSpecies;

    private enum Status {FREETIME, SEARCHING, WORKING}

    private Status status;

    public Guardian(String name, String favSpecies) {
        this.name = name;
        this.favSpecies = favSpecies;
        this.status = Status.FREETIME;
        Enclousure workingEnc = null;
        hourForWork = 0;
    }
    //=================getter and setter =========================

    public String getName() {
        return name;
    }

    public void setWorkingEncNull() {
        this.workingEnc = null;
    }

    public String getFavSpecies() {
        return favSpecies;
    }

    //============Simulation================
    public Vector<Animal> startWork(int hour, Vector<Enclousure> remainingWorkEnc) {
        Vector<Animal> injuredAnimals = new Vector<>();

        switch (status) {
            case FREETIME -> {
                if (hour == 7) {
                    System.out.printf("%s%s%s goes to work at 7.00\n", ConsoleColors.BLUE, name, ConsoleColors.RESET);
                    status = Status.SEARCHING;
                }
            }

            case WORKING -> {
                hourForWork--;
                if (hourForWork == 0) {
                    workingEnc.feedAllAnimals(this);
                    workingEnc.watchRndAnimal(this);
                    injuredAnimals.addAll(workingEnc.reportInjuredAnimals(this));
                    workingEnc.switchWorkFinished();
                    status = Status.SEARCHING;
                }
            }
            case SEARCHING -> {
                boolean found = false;
                while (!found) {
                    if (!remainingWorkEnc.isEmpty()) {
                        int rndIndex = Main.rnd.nextInt(0, remainingWorkEnc.size());
                        if (!remainingWorkEnc.get(rndIndex).getWorkFinished()) {
                            workingEnc = remainingWorkEnc.remove(rndIndex);
                            System.out.printf("%s%s%s visits %s%s%s for work! Its %d o'clock!\n", ConsoleColors.BLUE, name, ConsoleColors.RESET, ConsoleColors.PURPLE, workingEnc.getName(), ConsoleColors.RESET, hour);
                            hourForWork = Main.rnd.nextInt(1, 3);
                            found = true;
                            status = Status.WORKING;
                        }

                    } else if (remainingWorkEnc.isEmpty()) {
                        System.out.printf("Work is done at %d! %s%s%s goes home\n", hour, ConsoleColors.BLUE, name, ConsoleColors.RESET);
                        found = true;
                        status = Status.FREETIME;
                    }
                }
            }
        }
        return injuredAnimals;
    }
}

