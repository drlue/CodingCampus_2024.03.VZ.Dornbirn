package demian.week07.day01.Aufgabe1;

import demian.week07.day01.Aufgabe1.ArrayCalc;

public class Test {

    //AUFGABE 1:
    public static void main(String[] args) {
        int[] array = new int[]{2,54,2,-1,-78};

        ArrayCalc ac = new ArrayCalc(array);

        System.out.println("Min: " + ac.calcMin());
        System.out.println("Max: " + ac.calcMax());
        System.out.println("Avg: " + ac.avg());
    }

}
