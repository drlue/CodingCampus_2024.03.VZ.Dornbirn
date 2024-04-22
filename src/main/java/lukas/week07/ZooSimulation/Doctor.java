package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.ConcurrentModificationException;

public class Doctor {

    private String name;

    private static enum Status {LOOKING_FOR_ANIMAL, WORKING, IDLE}
    private Status status;
    private int duration;


    //--- constructor
    public Doctor(String name) {
        this.name = name;
        status = Status.LOOKING_FOR_ANIMAL;
        duration = 0;

    }

    //---get / set




    //---methods

    public void activityOfDoc(int hour){

        switch(status) {
            case LOOKING_FOR_ANIMAL -> {
                if(hour == 8) {
                    duration = Zoo.random.nextInt(1,5);
                    //TODO hier das zu behandelnde Tier ermitteln

                    System.out.printf("%d Uhr: %s behandelt [Animal]", hour, name);
                }
            }
        }

    }



    //---print

}
