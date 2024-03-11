package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil2 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumber = random.nextInt(101);

        int[] zufallswerte = new int[101];
        //Ich habe meine Schublade mit "Zufallswerte" benannt, sind ja mehrere. Und ich bestimme, dass sie 100 Werte enthält.
        zufallswerte[randomNumber] = randomNumber;
        System.out.println(Arrays.toString(zufallswerte));


/*        int[] test = {6, 7, 3, -1, 9, 5};

        for (int i = 0; i < test.length; i++) {
            int value = test[i];

            System.out.println("VALUE: " + value);
        }


        for (int value: test){
            System.out.println("VALUE: " + value);


    }*/
    }
}
