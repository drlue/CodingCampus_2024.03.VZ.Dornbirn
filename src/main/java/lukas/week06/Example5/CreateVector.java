package lukas.week06.Example5;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Vector;

public class CreateVector
{
    public static Random random = new Random();
    public static void main(String[] args) {
        //vector 20 numbers between 0-99
        Vector<Integer> vec = new Vector<>();
        for (int i = 0; i < 21; i++) {
            vec.add(random.nextInt(99));
        }
        //print
        printVec(vec);

        //count odd numbers
        System.out.println("Anzahl gerade Zahlen: "+countOddNumbers(vec));
        System.out.println("Minimum: " + getMin(vec));
        System.out.println("Maximum: " + getMax(vec));
        System.out.println("Sort Descending:");
        printVec(bubbleSortDesc(vec));
        System.out.println("Delete all uneven numbers");



    }


    public static void printVec(Vector<Integer> vector){
        for (int i = 0; i < vector.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(vector.get(i).toString());
        }
        System.out.println();
    }

    public static int countOddNumbers(Vector<Integer> vec){
        int count = 0;
        for (int i : vec) {
            if(i % 2 == 0) {
                count ++;
            }
        }
        return count;
    }

    public static int getMin(Vector<Integer> vec) {
        int min = Integer.MAX_VALUE;
        for(int i : vec) {
            if(i<min) {
                min = i;
            }
        }
        return min;
    }
    public static int getMax(Vector<Integer> vec) {
        int max = Integer.MIN_VALUE;
        for(int i : vec) {
            if(i>max) {
                max = i;
            }
        }
        return max;
    }

    public static Vector<Integer> bubbleSortDesc(Vector<Integer> vec) {
        Vector<Integer> res = (Vector<Integer>) vec.clone();
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.size()-i-1; j++) {
                if(res.get(j) < res.get(j+1)) {
                    int tmp = res.get(j);
                    res.set(j,res.get(j+1));
                    res.set(j+1,tmp);
                }
            }
        }
        return res;
    }
//     public static Vector<Integer> deleteUneven(Vector<Integer> vec) {
//        Vector<>
//    }



}
