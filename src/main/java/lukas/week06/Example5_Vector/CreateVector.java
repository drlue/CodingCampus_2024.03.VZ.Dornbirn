package lukas.week06.Example5_Vector;

import lukas.week06.Example3_Person.Person;

import java.util.*;

public class CreateVector {
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
        System.out.println("Anzahl gerade Zahlen: " + countOddNumbers(vec));
        System.out.println("Minimum: " + getMin(vec));
        System.out.println("Maximum: " + getMax(vec));
        System.out.println("Sort Descending:");
        printVec(bubbleSortDesc(vec));
        System.out.println("Delete all uneven numbers");
        Vector<Integer> vec1 = new Vector<Integer>();
        vec1.add(1);
        vec1.add(3);
        vec1.add(7);
        vec1.add(2);
        vec1.add(8);
        vec1.add(3);
        printVec(deleteUneven(vec1));

        System.out.println("Merge Vectors");
        Collections.sort(vec);
        Collections.sort(vec1);
        System.out.println("Vector 1");
        System.out.println(vec);
        System.out.println(vec1);
        System.out.println("Merged Vectors");
        System.out.println(mergeVectors(vec, vec1));



    }


    public static void printVec(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(vector.get(i).toString());
        }
        System.out.println();
    }

    public static int countOddNumbers(Vector<Integer> vec) {
        int count = 0;
        for (int i : vec) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getMin(Vector<Integer> vec) {
        int min = Integer.MAX_VALUE;
        for (int i : vec) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int getMax(Vector<Integer> vec) {
        int max = Integer.MIN_VALUE;
        for (int i : vec) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static Vector<Integer> bubbleSortDesc(Vector<Integer> vec) {
        Vector<Integer> res = (Vector<Integer>) vec.clone();
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.size() - i - 1; j++) {
                if (res.get(j) < res.get(j + 1)) {
                    Integer tmp = res.set(j, res.get(j + 1));
                    res.set(j + 1, tmp);
                }
            }
        }
        return res;
    }

    public static Vector<Integer> deleteUneven(Vector<Integer> vec) {
        Vector<Integer> res = (Vector<Integer>) vec.clone();
        for (int i = 0; i < res.size(); ++i) {
            if (res.get(i) % 2 != 0) {
                res.remove(i);
                --i;
            }
        }
        return res;
    }

    public static Vector<Integer> mergeVectors(Vector<Integer> vec1, Vector<Integer> vec2) {
        Vector<Integer> res = new Vector<>();
        res.addAll(vec1);
        res.addAll(vec2);
        Collections.sort(res);
        return res;
    }

    ArrayList<Person> persons = new ArrayList<>();



}
