package lukas.week06.Example5_Vector;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class CreateVector {
    public static Random random = new Random();

    public static void main(String[] args) {
        //vector 20 numbers between 0-99
        Vector<Integer> vec1 = new Vector<>();
        for (int i = 0; i < 21; i++) {
            vec1.add(random.nextInt(99));
        }
        Vector<Integer> vec2 = new Vector<>();
        vec2.add(1);
        vec2.add(3);
        vec2.add(7);
        vec2.add(2);
        vec2.add(8);
        vec2.add(3);


        //print
        printVec(vec1);
        printVec(vec2);

        //count odd numbers
        System.out.println("Anzahl gerade Zahlen: " + countOddNumbers(vec1));
        System.out.println("Minimum: " + getMin(vec1));
        System.out.println("Maximum: " + getMax(vec1));

        System.out.println("Sort Descending:");
        printVec(bubbleSortDesc(vec1));

        System.out.println("Delete all uneven numbers");
        printVec(deleteUneven(vec2));

        System.out.println("Merge Vectors");
        //make copy of vec1 and vec2
        Vector<Integer> v1 = new Vector<>(vec1);
        Vector<Integer> v2 = new Vector<>(vec2);
        System.out.println("Vector 1");
        System.out.println(v1);
        System.out.println("Vector 2");
        System.out.println(v2);
        System.out.println("Merged Vectors");
        System.out.println(mergeVectorsV2(v1, v2));

        System.out.println("Merged SortedVectors");
        //make copy of vec1 and vec2
        Vector<Integer> v3 = new Vector<>(vec1);
        Vector<Integer> v4 = new Vector<>(vec2);
        Collections.sort(v3);
        Collections.sort(v4);
        System.out.println(mergeSortedVectorsV2(v3, v4));


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

    public static Vector<Integer> mergeVectorsV2(Vector<Integer> vec1, Vector<Integer> vec2) {
        Vector<Integer> res = new Vector<>();
        //vector 1
        while (!vec1.isEmpty()) {
            if (res.isEmpty()) {
                res.add(vec1.getFirst());
                vec1.removeFirst();
            }
            for (int i = 0; i < res.size(); i++) {
                if (vec1.getFirst() < res.get(i)) {
                    res.add(i, vec1.getFirst());
                    vec1.removeFirst();
                    break;
                } else if (i == res.size() - 1) {
                    res.add(vec1.getFirst());
                    vec1.removeFirst();
                    break;
                }
            }
        }
        //vector 2
        while (!vec2.isEmpty()) {
            for (int i = 0; i < res.size(); i++) {
                if (vec2.getFirst() < res.get(i)) {
                    res.add(i, vec2.getFirst());
                    vec2.removeFirst();
                    break;
                } else if (i == res.size() - 1) {
                    res.add(vec2.getFirst());
                    vec2.removeFirst();
                    break;
                }
            }
        }
        return res;
    }

    public static Vector<Integer> mergeSortedVectors(Vector<Integer> vec1, Vector<Integer> vec2) {
        Vector<Integer> res = new Vector<>(vec1); //copy all elements from vec1 to res
        while (!vec2.isEmpty()) {
            for (int i = 0; i < res.size(); i++) {
                if (vec2.getFirst() < res.get(i)) {
                    res.add(i, vec2.getFirst());
                    vec2.removeFirst();
                    break;
                }
            }
        }
        return res;
    }

    public static Vector<Integer> mergeSortedVectorsV2(Vector<Integer> vec1, Vector<Integer> vec2) {
        Vector<Integer> res = new Vector<Integer>();
        while (!vec1.isEmpty() && !vec2.isEmpty()) {
            if (vec1.getFirst() < vec2.getFirst()) {
                res.add(vec1.getFirst());
                vec1.removeFirst();
            } else {
                res.add(vec2.getFirst());
                vec2.removeFirst();
            }
        }
        if (!vec1.isEmpty()) {
            res.addAll(vec1);
        } else if (!vec2.isEmpty()) {
            res.addAll(vec2);
        }
        return res;
    }


}
