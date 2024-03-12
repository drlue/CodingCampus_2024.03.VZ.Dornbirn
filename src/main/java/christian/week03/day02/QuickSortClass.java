package christian.week03.day02;


import java.util.Arrays;
import java.util.Random;

public class QuickSortClass {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] array = createRandomNumberArray(9, 0, 101);
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);

    }

    public static int[] createRandomNumberArray(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return; }

            int q = random.nextInt(l, r+1);
            int m = partition(arr, l, r, q);
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, r);
        System.out.println(Arrays.toString(arr));

    }

    public static int partition(int[] arr, int l, int r, int q) {
        int p = arr[q];
        arr[q] = arr[r];
        arr[r] = p;
        int i = l;

        for (int j = l; j < r ; j++) {
            if (arr[j] <= p) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
            }
        }
        int temp3 = arr[i];
        arr[i] = arr[r];
        arr[r] = temp3;
        return i;
    }
}
