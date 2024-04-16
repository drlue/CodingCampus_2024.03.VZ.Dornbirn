package samet.week06;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class MergeVector {

    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1); vector1.add(2); vector1.add(3); vector1.add(4); vector1.add(5); vector1.add(6); vector1.add(7); vector1.add(8); vector1.add(9); vector1.add(10);
        vector1.add(11); vector1.add(12); vector1.add(13); vector1.add(14); vector1.add(15); vector1.add(16); vector1.add(17); vector1.add(18); vector1.add(19); vector1.add(20);
        System.out.println("Vector1: " + vector1);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(21); vector2.add(22); vector2.add(23); vector2.add(24); vector2.add(25); vector2.add(26); vector2.add(27); vector2.add(28); vector2.add(29); vector2.add(30);
        vector2.add(31); vector2.add(32); vector2.add(33); vector2.add(34); vector2.add(35); vector2.add(36); vector2.add(37); vector2.add(38); vector2.add(39); vector2.add(40);
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