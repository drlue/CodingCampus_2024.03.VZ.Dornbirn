package samet.week2.day1;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Wuerfelspiel {

    // Würfelspiel mit 2 Würfel
    public static void main(String[] args) {
        Random random = new Random();
        int zufallZahl1 = random.nextInt(6) +1;
        System.out.println(zufallZahl1 +"   Würfel 1");
        int zufallZahl2 = random.nextInt(6) +1;
        System.out.println(zufallZahl2 +"   Würfel 2");
    }



}
