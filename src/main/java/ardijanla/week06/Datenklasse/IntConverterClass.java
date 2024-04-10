package ardijanla.week06.Datenklasse;

public class IntConverterClass {

    private int[] givenArray;

    public IntConverterClass(int[] intArray) {
        this.givenArray = intArray;
    }


    public float getAvg() {
        int sum = 0;
        for (int x : givenArray) {
            sum += x;
        }
        return  (float)sum / givenArray.length;
    }


    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < givenArray.length; i++) {
            if (min > givenArray[i]) {
                min = givenArray[i];
            }
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < givenArray.length; i++) {
            if (max < givenArray[i]) {
                max = givenArray[i];
            }
        }

        return max;
    }


}
