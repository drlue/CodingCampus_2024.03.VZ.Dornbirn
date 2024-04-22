package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.ConcurrentModificationException;

public class Doctor {

    private String name;

    private static enum Status {LOOKING_FOR_ANIMAL, WORKING, IDLE}

    private Status status;
    private int duration;
    private Animal treatedAnimal;


    //--- constructor
    public Doctor(String name) {
        this.name = name;
        status = Status.LOOKING_FOR_ANIMAL;
        duration = 0;
        treatedAnimal = null;

    }

    //---get / set


    //---methods

    public String getColoredName(String color) {
        return String.format("%s%s%s%s",
                ConsoleColors.WHITE_BACKGROUND_BRIGHT,
                color,
                name,
                ConsoleColors.RESET);
    }

    public String getColoredName() {
        return getColoredName(ConsoleColors.RED_BOLD);
    }


    public void activityOfDoc(int hour, Animal animal) {

        switch (status) {
            case LOOKING_FOR_ANIMAL -> {
                if (hour >= 8 && hour < 15 && animal.getRelativeHealth() != 1) {
                    treatedAnimal = animal;
                    treatedAnimal.setInTreatmentAtMoment(true);
                    duration = Zoo.random.nextInt(1, 5);
                    System.out.printf("%d Uhr: %s beginnt %s (Rel. Health: %.0f%%) zu behandeln%n", hour, getColoredName(), treatedAnimal.getColoredName(), treatedAnimal.getRelativeHealth()*100);
                    status = Status.WORKING;
                } else if(hour == 15) {
                    System.out.printf("%s hatte heute keine Patienten%n", getColoredName());
                    status = Status.IDLE;
                }
            }
            case WORKING -> {
                duration--;
                if (duration <= 0) {
                    treatedAnimal.heal(this, hour);
                    status = Status.IDLE;
                }
            }
            case IDLE -> {
                if (hour >= 15) {
                    System.out.printf("%d Uhr: %s hat seine Arbeit getan und geht nach Hause%n", hour, getColoredName());
                    status = Status.LOOKING_FOR_ANIMAL;
                    treatedAnimal = null;
                }

            }
        }

    }


    //---print

}
