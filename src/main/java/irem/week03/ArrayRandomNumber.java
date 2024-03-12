package irem.week03;


import java.util.Arrays;
import java.util.Random;


public class ArrayRandomNumber {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] arr = createRandomArray(15);
        System.out.println(Arrays.toString(arr));
        printArrayWithForI(arr);
        printArrayWithForEach(arr);
    }

    public static void printArrayWithForEach(int[] arr) {
        //das sout.print wird vor dem boolean gesetzt damit die erste zahl in der [ <- klammer steht
        //die erste zahl wird als true ausgegeben
        //es wird vor der ersten zahl kein kommer gesetzt daher !first
        //und dann kommt mein print für die kommer
        //nach der geschwungenen klammer leg ich first=false fest dann kommt der print mit value
        //zumschluss sout.println ]<- damit die letze zahl in der klammer steht

        System.out.print("[");
        boolean first = true;
        for (int value : arr) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(value);
        }
        System.out.println("]");
    }


    //sout.print kommt vor der for schleife damit die [<- klammer am anfang steht
    ////Hiermit erstelle ich meinen Array
    //sout.print , <- damit vor jeder zahl ein kommer steht
    //und Ausgabe Jedes Elements wird angegeben
    //zumschluss sout.println ]<- damit die letzte zahl in der klammer steht
    public static void printArrayWithForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 101);
        }
        return arr;

    }
}



