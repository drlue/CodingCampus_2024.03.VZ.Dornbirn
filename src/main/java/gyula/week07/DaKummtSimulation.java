package gyula.week07;

import ardijanla.ConsoleColors;

import java.util.Random;

public class DaKummtSimulation {

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
