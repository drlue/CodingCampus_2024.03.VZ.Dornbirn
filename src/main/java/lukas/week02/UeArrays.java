package lukas.week02;


import lukas.Helper;

import java.util.Arrays;
import java.util.Random;

public class UeArrays {

    public static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = randomArray(10);

        //numberArray();
        //numberArray2();
        //testMakeACopy();
        //printArray();
        //randomNumberArrayCrazyArray();
        //randomNumberArrayCrazyArrayV2();
        //randomNumberArrayCount();
        //randomNumberArraySum();
        //randomNumberArrayMinMaxAvgTest();
        //lzSortTest();

        printArrayForI(arr);
        printArrayForEach(arr);


    }

    public static void numberArray() {
        int dimension = Helper.readIntFromConsole("Size of Array >>>");
        int[] nrArr = new int[dimension];
        for (int i = 0; i < nrArr.length; i++) {
            nrArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(nrArr));
    }

    public static void numberArray2() {
        int dimension = Helper.readIntFromConsole("Size of Array >>>");
        int[] nrArr = new int[dimension];
        for (int i = 0; i < nrArr.length; i++) {
            nrArr[i] = nrArr.length - i;
        }
        System.out.println(Arrays.toString(nrArr));
    }


    public static int[] makeACopy(int[] original) {
        int[] aCopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            aCopy[i] = original[i];
        }
        return aCopy;
    }

    public static void testMakeACopy() {
        int[] arr = randomArray(10);
        int[] arrCopy = makeACopy(arr);

        System.out.println();
        System.out.println("Test makeACopy of Array");
        System.out.println("=======================");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Copy:");
        System.out.println(Arrays.toString(arrCopy));
        System.out.println("----------------------");
        System.out.println("Make some changes to Copy:");

        arrCopy[0] = -100;

        System.out.println("----------------------");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Copy:");
        System.out.println(Arrays.toString(arrCopy));
    }

    public static int[] randomArray(int minDimension, int maxDimension, int minValue, int maxValue) {
        int dimension = random.nextInt(minDimension, maxDimension + 1);
        int[] arr = new int[dimension];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(minValue, maxValue);
        }
        return arr;
    }


    public static int[] randomArray(int maxDimension) {
        return randomArray(1, maxDimension + 1, 1, 100);
    }



    public static void printArray() {
        int[] arr = randomArray(10, 11, 1, 100);

        //output mit foreach schleife
        String output1 = "[";
        for (int i : arr) {
            output1 += i;
            output1 += ", ";
        }
        //letztes ", " entfernen
        output1 = output1.substring(0, output1.length() - 2);
        output1 += "]";

        //output mit fori schleife
        String output2 = "[";
        for (int i = 0; i < arr.length; i++) {
            output2 += arr[i];
            if (i < arr.length - 1) {
                output2 += ", ";
            }
        }
        output2 += "]";

        //output every second value
        String output3 = "[";
        for (int i = 0; i < arr.length; i += 2) {
            output3 += arr[i];
            if (i < arr.length - 2) {
                output3 += ", ";
            }
        }
        output3 += "]";

        System.out.println("Array.toString():");
        System.out.println(Arrays.toString(arr));
        System.out.println("Ausgabe mit foreach-Schleife:");
        System.out.println(output1);
        System.out.println("Ausgabe mit fori-Schleife:");
        System.out.println(output2);
        System.out.println("Ausgabe zweiter, fünfter und zehnter Wert:");
        System.out.printf("[%d, %d, %d]\n", arr[1], arr[4], arr[9]);
        System.out.println("Ausgabe jedes zweiten Wertes:");
        System.out.println(output3);
    }

    public static void printArrayForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");

    }

    public static void printArrayForEach(int[] arr) {
        System.out.print("[");
        boolean isFirst = true;
        for (int value : arr) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(value);
            isFirst = false;
        }
        System.out.println("]");
    }

    public static void randomNumberArrayCrazyArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50, 50);
        }

        String output = "[";
        for (int value : arr) {
            output += value + ", ";
            System.out.print(value);
        }
        //Am Ende ", " zuviel
        output = output.substring(0, output.length() - 2);
        output += "]";
        System.out.println();
        System.out.println(output);
    }

    public static void randomNumberArrayCrazyArrayV2() {
        int[] arr = randomArray(10, 10, -50, 50);
        System.out.println(Arrays.toString(arr));
    }

    public static void randomNumberArrayCount() {
        //Array erstellen
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        //Werte > 30 zählen
        int count = 0;
        for (int value : arr) {
            if (value > 30) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("%d Werte > 30\n", count);
    }

    public static void randomNumberArraySum() {
        //Array erstellen
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        //Werte Summieren
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Die Summe der Werte = %d\n", sum);
    }

    public static void randomNumberArrayMinMaxAvgTest() {

//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(1, 100);
//        }

        int[] arr = {};
        System.out.println(Arrays.toString(arr));

        System.out.printf("%-17s %2s %10d\n", "Length", "=", arr.length);
        System.out.printf("%-17s %2s %10d\n", "Sum", "=", arrSum(arr));
        System.out.printf("%-17s %2s %10d\n", "Min Value", "=", arrMin(arr));
        System.out.printf("%-17s %2s %10d\n", "Man Value", "=", arrMax(arr));
        System.out.printf("%-17s %2s %13.2f\n", "Avg Value", "=", arrAvg(arr));

        System.out.printf("%-17s %2s %10s\n", "Index Min Value", "=", "[" + indexMinValue(arr) + "]");
        System.out.printf("%-17s %2s %10s\n", "Index Max Value", "=", "[" + indexMaxValue(arr) + "]");
    }


    public static int arrCountGreaterThan(int[] arr, int greaterThan) {
        int count = 0;
        if (arr != null) {
            for (int value : arr) {
                if (value > greaterThan) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        if (arr != null) {
            for (int value : arr) {
                sum += value;
            }
        }
        return sum;
    }


    public static int arrMin(int[] arr) {
        int arrMin = Integer.MAX_VALUE;
        if (arr != null) {
            for (int value : arr) {
                if (value < arrMin) {
                    arrMin = value;
                }
            }
        }
        return arrMin;
    }

    public static int arrMax(int[] arr) {
        int arrMax = Integer.MIN_VALUE;
        if (arr != null) {
            for (int value : arr) {
                if (value > arrMax) {
                    arrMax = value;
                }
            }
        }
        return arrMax;
    }

    public static double arrAvg(int[] arr) {
        double avg = 0;
        if (arr != null && arr.length != 0) {
            int sum = arrSum(arr);
            avg = (double) sum / arr.length;
        }
        return avg;
    }

    public static int indexMinValue(int[] arr) {

        int indexMinValue = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrMin(arr)) {
                indexMinValue = i;
            }
        }
        return indexMinValue;
    }

    public static int indexMaxValue(int[] arr) {
        int indexMaxValue = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrMax(arr)) {
                indexMaxValue = i;
            }
        }
        return indexMaxValue;
    }

    //Langsam da n^n durchgänge!
    public static void lzSort(int[] arr, boolean ascending) {
        if (arr != null && arr.length != 0) {
            int[] tmpArr = makeACopy(arr);
            int indexMinValue = 0;
            for (int j = 0; j < tmpArr.length; j++) {
                //Schleife zur Bestimmung des nächsten Minimums von tmpArray
                int minValue = Integer.MAX_VALUE;
                for (int i = 0; i < tmpArr.length; i++) {
                    if (tmpArr[i] < minValue) {
                        minValue = tmpArr[i];
                        indexMinValue = i;
                    }
                }
                tmpArr[indexMinValue] = Integer.MAX_VALUE;
                if (ascending) {
                    arr[j] = minValue;
                } else { //descending
                    arr[arr.length - 1 - j] = minValue;
                }
            }
        }
    }

    public static void lzSortTest() {
        int[] arr = randomArray(10, 11, 0, 100);
        System.out.println(Arrays.toString(arr));
        lzSort(arr, true);
        System.out.println(Arrays.toString(arr));
        lzSort(arr, false);
        System.out.println(Arrays.toString(arr));
    }


}
