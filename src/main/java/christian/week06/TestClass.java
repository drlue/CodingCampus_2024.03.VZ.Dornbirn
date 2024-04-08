package christian.week06;

import java.util.Random;

public class TestClass {
    static Random random = new Random();
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5, -7};
        IntegerArrayEckdaten nummerEins = IntegerArrayEckdaten.calcMinMaxAvg(arr);
        System.out.println("min: " + nummerEins.getMinimum());
        System.out.println("max: " + nummerEins.getMaximum());
        System.out.println("avg: " + nummerEins.getAverage());
        System.out.println(nummerEins.toString());

        System.out.println();
/*
        Person christian = new Person("Christian Schmid", 176, 33,80);
        Person franco = new Person ("franco", 180, 35, 80);
        System.out.println(christian.toString());
        System.out.println(franco.toString());


 */
    }
    public static int[] createRandomNumberArray(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }
}
