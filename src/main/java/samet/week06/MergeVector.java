package samet.week06;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class MergeVector {

    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>();
        vector1.add(9);
        vector1.add(51);
        vector1.add(23);
        vector1.add(1);
        vector1.add(31);
        sortDescending(vector1);
        System.out.println("Vector1: " + vector1);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(8);
        vector2.add(6);
        vector2.add(11);
        vector2.add(10);
        vector2.add(17);
        sortDescending(vector2);
        System.out.println("Vector2: " + vector2);

        Vector<Integer> mergedVector = new Vector<>();
        mergedVector.addAll(vector1);
        mergedVector.addAll(vector2);
        sortDescending(mergedVector);
        System.out.println("Merged Vector: " + mergedVector);
    }

    public static void sortDescending(Vector<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
    }

}