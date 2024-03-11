package irem.week02;
import java.util.Arrays;

public class NumberArray2 {
    public static void main(String[] args) {
        int size = 10;
        //Bestimme die grösse des Arrays
        int[] arr = new int[size];
        //Hiermit erstelle ich meinen Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        //Array in absteigende reienfolge
        System.out.println(Arrays.toString(arr));

    }
}

