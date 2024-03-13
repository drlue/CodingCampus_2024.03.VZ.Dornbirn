package christian.week03.day02;

public class BubbleSortClass {
    public static void main(String[] args) {

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
}
