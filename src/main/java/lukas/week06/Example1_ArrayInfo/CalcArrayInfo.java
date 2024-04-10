package lukas.week06.Example1_ArrayInfo;

public class CalcArrayInfo {

    //properties
    private int[] array;

    //constructor
    public CalcArrayInfo(int[] array) {
        if (array != null) {
            this.array = array;
        } else {
            System.out.println("Array is null!");
        }
    }


    //General methods
    public int calcMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int calcMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public float calcAvg() {
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = (float) sum / array.length;
        return avg;
    }

    @Override
    public String toString() {
        if (this.array != null) {
            return String.format("""
                Minimum: %d
                Maximum: %d
                Average: %f\s""", calcMin(), calcMax(), calcAvg());
        }else {
            return "Array is null!!!!";
        }
    }

}
