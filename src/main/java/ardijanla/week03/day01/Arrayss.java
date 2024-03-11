package ardijanla.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class Arrayss {
    public static void main(String[] args) {
        int[] arr = numberArray(5);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = makeACopy(arr);

        //Random Number Array
        //Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.
        int[] arr2 = randomNumberArray(10);
        System.out.println(Arrays.toString(arr2));

        //Gib es mit Hilfe einer foreach-Schleife aus.
        for (int element : arr2) {
            System.out.println(element);
        }

        //Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
        for (int i = 0; i < arr2.length; i++) {

            if (i == 0) {
                System.out.print("[");
            }
            if (i < arr2.length - 1) {
                System.out.printf("%d, ", arr2[i]);
            } else {
                System.out.printf("%d", arr2[i]);
            }
            if (i == arr2.length - 1) {
                System.out.print("]");
            }

        }
        System.out.println();

        //gib den zweiten,fünften und zehnten Wert des Arrays aus.
        System.out.println(arr2[1] + " " + arr2[4] + " " + arr2[9]);

        //Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr2[i]);
        }

        //Random Number Array Crazy Range
        int[] arr3 = arrayCrazyRange(5);
        System.out.println(Arrays.toString(arr3));

        //Array Zählen
        arrayZeahlen(arr3);

        //summe zählen
        System.out.println(arraySumme(randomNumberArray(100)));

        // Number Array Min/Max/Avg
        System.out.println(arrMax(5));
        System.out.println(arrMin(5));
        System.out.println(arrAvg(5));


        // bubble sort
        System.out.println(Arrays.toString(bubbleSort(arr2)));


    }

    public static int[] numberArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] makeACopy(int[] original) {
        int[] copy = new int[original.length];

        copy = original;
        return copy;
    }

    public static int[] randomNumberArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-1, 101);
        }
        return arr;
    }


    public static int[] arrayCrazyRange(int size) {
        Random rnd = new Random();
        int[] crazyInt = new int[size];


        for (int i = 0; i < crazyInt.length; i++) {
            crazyInt[i] = rnd.nextInt(-51, 51);
        }
        return crazyInt;
    }

    public static int arrayZeahlen(int[] arr) {
        int[] numbers = numberArray(100);
        for (int element : numbers) {
            if (element > 30) {
                return element;
            }
        }
        return 0;
    }

    public static int arraySumme(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static int arrMin(int size) {
        int[] numbers = randomNumberArray(size);

        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        return minNumber;
    }


    public static int arrMax(int size) {
        int[] numbers = randomNumberArray(size);

        int minNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }

    public static double arrAvg(int size) {
        int[] numbers = randomNumberArray(size);
        double value = 0;
        for (int i = 0; i < numbers.length; i++) {
            value += numbers[i];
        }
        return value / size;
    }


    public static int[] bubbleSort(int[] numbers) {
        for (int i = numbers.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
