package samet.week06;

import java.util.Random;
import java.util.Vector;

public class VectorRandom {

    public static void main(String[] args) {

       Vector<Integer> randomNumbers = new Vector<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(101);
            randomNumbers.add(rand);
        }
        System.out.println("Vector with 20 random Numbers between 0 - 100: ");
        System.out.println(randomNumbers);
    }

}
