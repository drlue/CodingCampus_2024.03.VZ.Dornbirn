package samet.week06.Datenklasse;

public class SametArray {
    private int[] arr;

    public SametArray(int[] arr) {
        if (arr.length > 0) {
            this.arr = arr;
        } else {
            throw new RuntimeException("Falsches Array Length");
        }
    }

    public int calcMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int calcMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public double calcAvarage() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public String toString() {
        return "Array Statistics: \n" +
                "Minimum: " + calcMin() + "\n" +
                "Maximum: " + calcMax() + "\n" +
                "Average: " + calcAvarage();
    }
}





