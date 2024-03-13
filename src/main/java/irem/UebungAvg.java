package irem;

public class UebungAvg {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        double avgeResult = avarage(test);
        System.out.println("AVG:" + avgeResult);
    }

    public static double avarage(int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        }

        return (double)summe / arr.length;
    }
}

//auf die nennung der namen achten!