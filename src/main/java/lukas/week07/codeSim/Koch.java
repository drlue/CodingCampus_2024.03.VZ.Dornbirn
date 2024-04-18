package lukas.week07.codeSim;

import java.util.Random;

public class Koch {
    private static Random rnd = new Random();
    private String name;

    private enum Work { IDLE, COOK, DISHWASH, FINISH};
    private Work currentJob;
    private int timeToLeft;

    private int mealsToCook;

    public Koch(String name){
        this.name = name;
        currentJob = Work.IDLE;
        timeToLeft = 0;
        mealsToCook = 2 + rnd.nextInt(11);
    }

    public boolean hasFinished(){
        return currentJob == Work.FINISH;
    }

    public void tick(){
        --timeToLeft;
        if (timeToLeft < 0) {
            switch (currentJob) {
                case IDLE -> {
                    currentJob = Work.COOK;
                    timeToLeft = rnd.nextInt(10);
                    System.out.printf("%s's cooking...%n", name);
                }
                case COOK -> {
                    --mealsToCook;
                    currentJob = Work.DISHWASH;
                    timeToLeft = rnd.nextInt(2);
                    System.out.printf("%s's dishwashing...%n", name);
                }
                case DISHWASH -> {
                    if (mealsToCook > 0) {
                        currentJob = Work.COOK;
                        timeToLeft = rnd.nextInt(5);
                        System.out.printf("%s's cooking again...%n", name);
                    } else {
                        currentJob = Work.FINISH;
                        System.out.printf("%s's finished his work shift...%n", name);
                    }
                }
                case FINISH -> {}
            }
        }
    }
}
