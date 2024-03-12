package samet.week03.day01;

import samet.week02.day2.UserInputTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomGenerator {
    public static Random random = new Random();

    public static void main(String[] args) {

//        int size = UserInputTest.getIntFromConsole("Bitte geben sie die Größe der zufällig generierten Arrays an", 0, 101);
        int[] randomArray = createRandomArray(12);
        System.out.println("Random assigned value of Array are");
        System.out.println(Arrays.toString(randomArray));
        printWithForI(randomArray);
        System.out.println();
        printWithForEach(randomArray);

        printArrayWithForEach(randomArray);
       System.out.println("Index 2: " + randomArray[1]);
       System.out.println("Index 5: " + randomArray[4]);
       System.out.println("Index 10: " + randomArray[9]);
 //     System.out.println(outPutAllEvenNumbers);
       printEverySecond(randomArray);
    }

    public static void printWithForI(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]) ;
            System.out.print(",");
        }
    }

    public static void printWithForEach(int[] arr){
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static int[] createRandomArray(int size) {
        int[] arrayToCreate = new int[size];
        for (int i = 0; i < arrayToCreate.length; i++) {
            arrayToCreate[i] = random.nextInt(101);
        }
        return arrayToCreate;
    }

    public static void printEverySecond(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayWithForEach(int[] arr) {
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }


    }











