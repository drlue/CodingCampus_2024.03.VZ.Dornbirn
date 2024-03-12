package gyula.week03;

import java.util.Arrays;

public class StructureAndNames {

    public static void main(String[] args) {
        printAAA();
        printBBB();
        int[] test = {-1, -2, -3, -2, -90, -1, -90};
        printArray(test);
        double avgResult = avarage(test);
        System.out.println("AVG: " + avgResult);

        System.out.println("MAX: " + maxValue(test));
    }

    public static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static double avarage(int[] arr){
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        }
        return (double)summe / arr.length;
    }

    public static void printAAA(){
        System.out.println("AAA");
    }
    public static void printBBB(){
        System.out.println("BBB");
    }

    public static void printArray(int[] values){
        System.out.println(Arrays.toString(values));
    }


}
