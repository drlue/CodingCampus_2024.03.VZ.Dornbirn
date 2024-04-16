package gyula.week07;

import ardijanla.ConsoleColors;

import java.util.Random;

public class DaKummtSimulation {
    private static Random rand = new Random();
    public static class Developer{
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

    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie){}
    }

    public static void main(String[] args) {
        System.out.println("Sunn, Sunn, Suun, schaut die kummt...");
        System.out.println("Da kummt die Sun!");

        Developer[] d = new Developer[]{
                new Developer("Katherina", ConsoleColors.RED),
                new Developer("Gyula", ConsoleColors.GREEN)
        };

        for (int day = 1; day <= 10; day++) {
            System.out.printf("Day %d begin:%n", day);
            for (int hour = 0; hour < 24; hour++) {
                for (int i = 0; i < d.length; i++) {
                    d[i].activity(hour);
                }
                sleep(250);
            }
        }
    }
}
