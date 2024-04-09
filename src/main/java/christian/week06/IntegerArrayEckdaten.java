package christian.week06;

public class IntegerArrayEckdaten {

    private int minimum;
    private int maximum;
    private float average;

    private IntegerArrayEckdaten(int min, int max, float avg){
        this.minimum = min;
        this.maximum = max;
        this.average = avg;
    }

    public static IntegerArrayEckdaten calcMinMaxAvg(int[] arr) {

        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
            }
        }

        int maxInt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return new IntegerArrayEckdaten(minInt, maxInt, (float)sum / arr.length);
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public float getAverage() {
        return average;
    }

    public String toString(){
        return ("Minimum: " + this.minimum + "\nMaximum: " + this.maximum + "\nAverage: " + this.average);
    }
}
