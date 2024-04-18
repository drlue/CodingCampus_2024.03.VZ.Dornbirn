package christian.week06.zooEnglish;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Guardian {
    private String name;
    private Vector<Enclousure> guaEncVector;

    private enum Status {FREETIME, SEARCHING, WORKING}

    private Status status;

    public Guardian(String name) {
        this.name = name;
        this.status = Status.FREETIME;
        guaEncVector = new Vector<>();
    }
    //=================getter and setter =========================


    public String getName() {
        return name;
    }

    //============Simulation================
    public void startWork(int hour, Vector<Enclousure> remainingWorkEnc) {
        int hourForWork = 0;
        Enclousure workingEnc = null;

        switch (status) {
            case FREETIME -> {
                if(hour==7){
                    if (workingEnc != null) {
                        hourForWork = Main.rnd.nextInt(1, 3);
                        status = Status.WORKING;
                    } else {
                        System.out.printf("%s%s%s goes to work at 7.00\n", ConsoleColors.BLUE, name, ConsoleColors.RESET);
                        status = Status.SEARCHING;
                    }
                }

            }
            case WORKING -> {
                hourForWork--;
                if (hourForWork == 0) {
                    workingEnc.feedAllAnimals(this);
                    workingEnc.switchWorkFinished();
                    status = Status.SEARCHING;
                }
            }
            case SEARCHING -> {
                int rndIndex = Main.rnd.nextInt(0, remainingWorkEnc.size());
                if (!remainingWorkEnc.isEmpty() && remainingWorkEnc.get(rndIndex).getWorkFinished() == false) {
                    workingEnc = remainingWorkEnc.remove(rndIndex);
                    System.out.printf("%s besucht %s um zu arbeiten! Es ist %d Uhr!\n", name, workingEnc.getName(), hour);
                    hourForWork = Main.rnd.nextInt(1, 3);
                    status = Status.WORKING;
                } else {
                    System.out.printf("Work is done at %d\n", hour);
                    status = Status.FREETIME;
                }
            }
        }

    }
}
