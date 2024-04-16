package samet.week06;

import java.util.Collections;
import java.util.Vector;

import static samet.week06.VectorCountOddEtc.generateRandomNumbers;

public class MergedVector2 {

    public static void main(String[] args) {

        Vector<Integer> rndNum1 = generateRandomNumbers(20);
        Vector<Integer> rndNum2 = generateRandomNumbers(20);
        System.out.println("Unsorted Vector1: " + rndNum1);
        System.out.println("Unsorted Vector 2: " + rndNum2);
        sortDescending(rndNum1);
        System.out.println("Sorted Vecrot 1:" + rndNum1);
        sortDescending(rndNum2);
        System.out.println("Sorted Vector 2:" + rndNum2);
        Vector<Integer> mergedVec = new Vector<>();
        mergedVec.addAll(rndNum1);
        mergedVec.addAll(rndNum2);
        System.out.println("Unsorted MergedVector: " + mergedVec);
        sortDescending(mergedVec);
        System.out.println("Sorted Merged Vector: " + mergedVec);


    }

    public static void sortDescending(Vector<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
    }


}
