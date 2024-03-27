package irem.HU;

public class AufagbeArray2 {

    public static void main(String[] args) {
        // Testarrays
        int[] arr1 = {10, 3, 4, 5, 2, 0};
        int[] arr2 = {23, 42, 34, 16, 15, 88, 56, 23, 42};

        // Teste für arr1
        System.out.println("Teste für arr1:");
        System.out.println("Minimum: " + getMin(arr1));
        System.out.println("Maximum: " + getMax(arr1));
        System.out.println("Durchschnitt: " + getarr(arr1));

        // Teste für arr2
        System.out.println("\nTeste für arr2:");
        System.out.println("Minimum: " + getMin(arr2));
        System.out.println("Maximum: " + getMax(arr2));
        System.out.println("Durchschnitt: " + getarr(arr2));
    }

    // Methode zum Finden des Minimum in einem Array
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Methode zum Finden des Maximums in einem Array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Methode zum Berechnen des Durchschnitts der Elemente in einem Array
    public static double getarr(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}


