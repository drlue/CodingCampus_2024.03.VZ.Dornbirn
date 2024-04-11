package franco.week06.ListAndVector;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class DCVExercises {
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> newList = randomNumberList(20);
        System.out.println(newList);
//        countingEvenNum(newList);
//        minValue(newList);
//        maxValue(newList);
        bubbleSortDSC(newList);
        System.out.println(newList);
//        deleteOddElement(newList);
//        System.out.println(newList);


    }

    public static ArrayList<Integer> randomNumberList(int size) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(101));
        }
        return randomList;
    }

    public static Vector<Integer> randomNumVector(int size) {
        Vector<Integer> vectorList = new Vector<>();
        for (int i = 0; i < size; i++) {
            vectorList.add(random.nextInt(100));
        }
        return vectorList;
    }

    public static void countingEvenNum(ArrayList<Integer> intList) {
        int countEven = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 == 0) countEven++;
        }
        System.out.println("number of even element: " + countEven);
    }

    public static void minValue(ArrayList<Integer> intList) {
        int minimumInt = Integer.MAX_VALUE;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < minimumInt) {
                minimumInt = intList.get(i);
            }
        }
        System.out.println("Minimum value is: " + minimumInt);
    }

    public static void maxValue(ArrayList<Integer> intList) {
        int maximumInt = Integer.MIN_VALUE;
        for (Integer integer : intList) {
            if (integer > maximumInt) {
                maximumInt = integer;
            }
        }
        System.out.println("Maximum value is: " + maximumInt);
    }

    public static void bubbleSortDSC(ArrayList<Integer> intList) {
        int temp;
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if(intList.get(j)<intList.get(j+1)){
                     temp= intList.get(j);
                     //Swapping through the set method
                     intList.set(j,intList.get(j+1));
                     intList.set(j+1,temp);
                }
            }
        }
    }

    public static void deleteOddElement(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 0; j < intList.size(); j++) {
                if ((intList.get(i) % 2) != 0) {
                    intList.remove(i);
                }
            }
        }
    }
}
