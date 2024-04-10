package lukas.week06.Example2;

public class MinMaxAvg {

    private int minimum;
    private int maximum;
    private float average;

    //constructor
    private MinMaxAvg(int minimum, int maximum, float average) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;

    }

    public int getMinimum(){
        return this.minimum;
    }

    public int getMaximum(){
        return this.maximum;
    }

    public float getAverage(){
        return this.average;
    }

    public static MinMaxAvg getArrayInfo(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]>max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        avg = (float)sum / arr.length;

        return new MinMaxAvg(min, max, avg);
    }

    @Override
    public String toString() {
        return String.format("""
                Minimum: %d
                Maximum: %d
                Average: %f\s""", minimum, maximum, average);
    }
}
