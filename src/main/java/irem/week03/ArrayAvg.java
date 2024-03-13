package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayAvg {

    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayAvg(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Avg:" + averageFromArray(arr));
    }

    //Integer avg wird auf 0 gesetzt
    //Ind der fori schleife ist der Index gleich 0
    //Der Index ist nicht gleich wie die länge
    //Der Index wird addiert und ist gleich arr index
    //Die Summe wird gedoublelt und durch die länge geteilt
    //Double damit ich kommerzahlen bekomme

    public static double averageFromArray(int[] arr) {
        int avg = 0;
        for (int i = 0; i != arr.length; i++) {
            avg += arr[i];
        }
        return ((double) avg / arr.length);
    }
        public static int[] createRandomArrayAvg ( int size){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1, 100);
            }
            return arr;
        }
    }
