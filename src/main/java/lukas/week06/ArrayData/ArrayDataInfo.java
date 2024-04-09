package lukas.week06.ArrayData;

public class ArrayDataInfo {

    private int minimum;
    private int maximum;
    private float average;

    //constructor
    ArrayDataInfo(int minimum, int maximum, float average) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;

    }

    @Override
    public String toString() {
        return String.format("""
                Minimum: %d
                Maximum: %d
                Average:\s""", minimum, maximum, average);
    }
}
