package katherina.week04.day01;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortStringExtended {

    public static void main(String[] args) {
        String[] names = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
        printWithForI(names);
        System.out.println(">> Dies ist eine Liste unsortierter Namen. <<");
        System.out.println();
        bubblesortNachHoch(names);
        System.out.println(">> Nach Länge sortiert, aufsteigend. <<");
        printWithForI(names);
        System.out.println();
        copy(names);
        System.out.println(">> Nach Länge sortiert, absteigend. <<");
        printWithForI(names);
        System.out.println();
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");
        Arrays.sort(names);
        printWithForI(names);
        System.out.println(">> Nach Alphabet sortiert, absteigend. <<");
        Arrays.sort(names, Collections.reverseOrder());
        printWithForI(names);
        System.out.println();
        System.out.println("Danke!");
    }

    public static void printWithForI(String[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }

    //Variable 'jane' heißt so aus Accessibility-Gründen. Ich kann sonst nicht gut sehen, ob etwas i oder j ist.
    public static void bubblesortNachHoch(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane].length() > array[jane + 1].length()) {
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static String[] copy(String[] originArray) {
        String[] result = new String[originArray.length];
        for (int index = 0; index < result.length; index++) {
            result[index] = String.join(originArray[index]);
            {
                for (int jane = 0; jane < originArray.length - index - 1; jane++) {
                    if (originArray[jane].length() < originArray[jane + 1].length()) {
                        String temp = originArray[jane];
                        originArray[jane] = originArray[jane + 1];
                        originArray[jane + 1] = temp;
                    }
                }
            }
        }

        return result;
    }

}
