package ardijanla.week03.day01;

import java.util.Arrays;
import java.util.Random;


public class Arrayss {

    static Random rnd = new Random();

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


            System.out.print("[");
            if (i < arr2.length - 1) {
                System.out.printf("%d, ", arr2[i]);
            } else {
                System.out.printf("%d", arr2[i]);
            }

            System.out.print("]");


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


        // bubble sort asc
        System.out.println(Arrays.toString(bubbleSortAsc(arr2)));

        //bubble sort desc
        System.out.println(Arrays.toString(bubbleSortDesc(arr2)));

        //2d Array
        int[][] ar = twoDArray(2, 4);
        printTwoDArray(ar);
        System.out.println(sumPerRow(ar, 0));
        System.out.println(sumPerCol(ar, 0));

        //Pascal Dreieck
        printTwoDArray(pascalDreieck(10));

        //Formula
        formulaGen(pascalDreieck(10), 3);


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


    public static int[] bubbleSortAsc(int[] numbers) {
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


    public static int[] bubbleSortDesc(int[] arr) {
        for (int i = arr.length; i > 0; i--) {

            for (int j = 0; j < i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[][] twoDArray(int row, int col) {
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(0, 100);
            }
        }
        return arr;
    }

    public static void printTwoDArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d ", arr[i][j]);

            }
            System.out.println();
        }
    }

    public static int sumPerRow(int[][] matrix, int rowToCalc) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                if (row == rowToCalc) {
                    sum += matrix[rowToCalc][col];
                }
            }
        }
        return sum;
    }

    public static int sumPerCol(int[][] matrix, int rowToCalc) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == rowToCalc) {
                    sum += matrix[row][rowToCalc];
                }
            }
        }
        return sum;
    }

    public static int[][] pascalDreieck(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] = matrix[row][col - 1] + matrix[row - 1][col];
                }

            }
        }
        return matrix;
    }


    public static void formulaGen(int[][] pascalMatrix, int size) {
//noch nicht fertig
        for (int row = 0; row < pascalMatrix.length; row++) {
            for (int col = 0; col < pascalMatrix[row].length; col++) {
                if (size - 1 == size - row && size -1 == col -1) {
                    System.out.println(pascalMatrix[row][col]);
                }
            }
        }

    }
}



