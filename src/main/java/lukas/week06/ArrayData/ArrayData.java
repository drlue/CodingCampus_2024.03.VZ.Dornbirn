package lukas.week06.ArrayData;

import java.util.Arrays;
import java.util.Random;

public class ArrayData {

    public static Random random = new Random();

    public static void main(String[] args) {

        int[] myArr = randomArray(3,3,0,100);
        System.out.println(Arrays.toString(myArr));
        System.out.println(getArrayInfo(myArr));


    }


    public static int[] randomArray(int minDimension, int maxDimension, int minValue, int maxValue) {
        int dimension = random.nextInt(minDimension, maxDimension + 1);
        int[] arr = new int[dimension];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(minValue, maxValue);
        }
        return arr;
    }

    public static ArrayDataInfo getArrayInfo(int[] arr) {
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

        ArrayDataInfo adi = new ArrayDataInfo(min, max, avg);
        return adi;

    }

}
