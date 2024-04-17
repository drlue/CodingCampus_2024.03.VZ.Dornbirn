package gyula.week07;

import ardijanla.ConsoleColors;

import java.util.Random;

public class Developer {
    private static Random rand = new Random();

    private String name;

    enum Status { IDLE, WORK, EAT, READ};
    private Status status;
    private int timeToLeft;
    private String color;

    public Developer(String name, String color){
        this.name = name;
        this.color = color;
        status = Status.IDLE;
        timeToLeft = 0;
    }

    public void activity(int hour){
        System.out.print(color);
        switch (status){
            case IDLE -> {
                if (hour == 7) {
                    System.out.printf("%s at %d starts to work.%n", name, hour);
                    status = Status.WORK;
                }
            }
            case WORK -> {
                if (hour == 17) {
                    System.out.printf("%s at %d goes to cook some meal.%n", name, hour);
                    status = Status.EAT;
                }
            }
            case EAT -> {
                System.out.printf("%s at %d enjoy the fiction book Dune.%n", name, hour);
                status = Status.READ;
                timeToLeft = rand.nextInt(2, 4);
            }
            case READ -> {
                --timeToLeft;
                if (timeToLeft <= 0){
                    System.out.printf("%s at %d goes to sleep.%n", name, hour);
                    status = Status.IDLE;
                }
            }
        }
        System.out.print(ConsoleColors.RESET);
    }
}
