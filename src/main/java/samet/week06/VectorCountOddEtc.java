package samet.week06;

import java.util.Collections;
import java.util.Vector;
import java.util.Random;

public class VectorCountOddEtc {


    public static void main(String[] args) {

        Vector<Integer> randumNumbers = generateRandomNumbers(20);
        System.out.println(randumNumbers);

        int evenNumbers = countEvenNumbers(randumNumbers);
        System.out.println("Count of Even Numbers is: " + evenNumbers);

        int smallestNumber = findSmallestNumber(randumNumbers);
        System.out.println("The smallest Number in Vector is: " + smallestNumber);

        int biggestNumber = findBiggestNumber(randumNumbers);
        System.out.println("The biggest Number in Vector is: " + biggestNumber);

        sortDescending(randumNumbers);
        System.out.println("Vector in sorted descending Order: " + randumNumbers);

        deleteOddNumbers(randumNumbers);
        System.out.println("Vector without Odd Numbers: " + randumNumbers);
    }

    public static Vector<Integer> generateRandomNumbers(int count) {

        Vector<Integer> randomNumbers = new Vector<Integer>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int rand = random.nextInt(101);
            randomNumbers.add(rand);
        }
        return randomNumbers;
    }

    public static int countEvenNumbers(Vector<Integer> numbers) {

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallestNumber(Vector<Integer> numbers){
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestNumber){
                smallestNumber = numbers.get(i);
            }
        }
        return smallestNumber;
    }

    public static int findBiggestNumber(Vector<Integer> numbers){
        int biggestNumber  = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > biggestNumber){
                biggestNumber = numbers.get(i);

            }
        }
        return biggestNumber;
    }

    public static void sortDescending(Vector<Integer> numbers){
        Collections.sort(numbers, Collections.reverseOrder());
    }

    public static void deleteOddNumbers(Vector<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0){
                numbers.remove(i);
                i--;
            }
        }
    }
}











