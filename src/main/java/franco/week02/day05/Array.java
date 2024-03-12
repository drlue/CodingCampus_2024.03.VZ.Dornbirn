package franco.week02.day05;

import franco.week02.day02.UserInput;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static Random random = new Random();

    public static void main(String[] args) {

        int size = UserInput.getIntFromConsole("Enter the number of element desire", 1, 100);
        int[] array = new int[size];
        ascendingOrder(size);
        System.out.println();
        descendingOrder(size);
        System.out.println("Print method");

        // print random number array
        int[] randomNumber = generateRandomNumberArray(size);
        System.out.println("Random number generated");

        //print element using a for each loop
        System.out.println("Print element using for each loop:");
        for (int number : randomNumber) {
            System.out.println("For each printed element:" + number);
        }

        //Print element using a for loop
        System.out.println("Print the element using a for loop:");
        for (int i = 0; i < randomNumber.length; i++) {
            System.out.println(" Index " + i + ": " + randomNumber[i]);
        }
        printCopy(randomNumber);
        //tostring
        System.out.println("using to string as method to print out " + Arrays.toString(randomNumber));

    }

    public static void ascendingOrder(int x) {
        //declaring a new array
        int[] array = new int[x];
        for (int index = 0; index < array.length; index++) {
            array[index] = index + 1;

        }
        System.out.println("Array in ascending order along with indices:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ascending Index " + i + ": " + array[i]);
        }
    }

    public static void descendingOrder(int size) {
        // declare a new array
        int[] array = new int[size];
        for (int element = 0; element < array.length; element++) {
            array[element] = array.length - element;

        }
        System.out.println("Array in descending order along with indices:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Descending Index " + i + ": " + array[i]);
        }
    }

    public static int[] generateRandomNumberArray(int size) {
        //declare a new array
        int[] randomNum = new int[size];
        for (int index = 0; index < size; index++) {
            randomNum[index] = random.nextInt(100);
        }
        return randomNum;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("print method array " + array[i]);
        }
    }

    //arrange already given element in an array in ascending order
    public static void printArrayInAscendingOrder(int arr) {
        int[] array = new int[arr];
        //n as array length
        int n = array.length;
        // Sorting the array in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Printing the sorted array along with their respective indices
        System.out.println("Array in ascending order along with indices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

    public static int[] printCopy(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("copied array" + copy[i]);
        }
        return copy;
    }


}









