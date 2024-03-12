package christian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethoden {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] array = createRandomNumberArray(10, 0, 101);  //{1,2,3,6,7,8,2,0};
        System.out.println(Arrays.toString(array));
        printIntArray(array);
        System.out.println("MaxValue: " + getMaxValue(array));
        System.out.println("Index of Maxvalue: " + getIndexOfMax(array));
        System.out.println("MinValue: " + getMinValue(array));
        System.out.println("Index of Minvalue: " + getIndexOfMin(array));

        System.out.println(Arrays.toString(bubblesortWith2xForUp(array)));
        System.out.println(Arrays.toString(bubblesortWith2xForDown(array)));
        System.out.println(Arrays.toString(selectionSort(array)));
        System.out.println(Arrays.toString(quickSort(array, 0, array.length - 1)));


//        System.out.println(returnMinIntValueOfIntArray(array));
    }

    public static int[] createRandomNumberArray(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    public static void printIntArray(int[] arr) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index: " + i + " Value: " + arr[i]);
            }
        } else {
            System.out.println("Das Array beinhaltet keine Werte!");
        }
    }

    public static void printIntArrayForeach(int[] arr) {
        if (arr.length > 0) {
            int indexNumber = 0;
            for (int value : arr) {
                System.out.println("Index: " + indexNumber + " Value: " + value);
                indexNumber++;
            }
        } else {
            System.out.println("Das Array beinhaltet keine Werte!");
        }
    }

    public static String createString(int[] arr) {
        String result = "";
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                str.append(arr[i] + ",");
            else {
                str.append(arr[i]);
            }
        }
        str.append("]");
        return str.toString();
    }

    public static int getValueCount(int[] arr, int value) {
        int valueCounter = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (value == arr[i]) {
                    valueCounter++;
                }
            }
        }
        return valueCounter;
    }

    public static int getValueCountGreaterThan(int[] arr, int value) {
        int valueCounter = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (value > arr[i]) {
                    valueCounter++;
                }
            }
        }
        return valueCounter;
    }

    public static int getMinValue(int[] arr) {
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
            }
        }
        return minInt;
    }

    public static int getMaxValue(int[] arr) {
        int maxInt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        return maxInt;
    }

    public static int getIndexOfMin(int[] arr) {
        int minInt = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int getIndexOfMax(int[] arr) {
        int maxInt = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] bubblesort(int[] arr) {
        boolean swapped = true;
        boolean first = true;
        int temp = Integer.MIN_VALUE;
        while (swapped) {
            for (int i = 0; i < arr.length; i++) {
                if (first) {
                    temp = arr[i];
                    first = false;
                    swapped = false;
                } else {
                    if (arr[i] < arr[i - 1]) {
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                        temp = arr[i];
                    } else {
                        temp = arr[i];
                    }
                }
            }
            first = true;
        }
        return arr;
    }

    public static int[] bubblesortByGyula(int[] arr) {
        boolean swapped = true;
        int rounds = 0;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < arr.length - rounds; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            ++rounds;
        }
        return arr;
    }

    public static int[] bubblesortWith2xForUp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubblesortWith2xForDown(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int l, int r) {

        int q = random.nextInt(0, 10);
        while (l >= r) {

            int m = partition(arr, l, r, q);
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, r);
        }
        return arr;
    }

    public static int partition(int[] arr, int l, int r, int q) {
        int p = arr[q];
        int temp1 = arr[q];
        arr[q] = arr[r];
        arr[r] = temp1;
        int i = l;
        for (int j = l; j < r - 1; j++) {
            if (arr[j] <= p) {
                p = arr[q];
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
            }
            int temp3 = arr[i];
            arr[i] = arr[r];
            arr[r] = temp3;
        }
        return i;
    }
}
