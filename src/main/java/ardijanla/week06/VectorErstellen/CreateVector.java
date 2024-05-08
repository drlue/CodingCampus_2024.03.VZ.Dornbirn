package ardijanla.week06.VectorErstellen;

import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;
import java.util.function.ToDoubleBiFunction;

public class CreateVector {
    static Random rnd = new Random();

    public static void main(String[] args) {
        Vector<Integer> vec = createVector(20);
        Vector<Integer> vec1 = createVector(25);

//        System.out.println(vec);
//        System.out.println(getEvenNumbers(vec));
//        System.out.println(getSmallestNumbers(vec));
//        System.out.println(getBiggestNumber(vec));
//        System.out.println(sortByAsc(vec));
//        System.out.println(sortByDesc(vec));
//        System.out.println(deleteOddNumbers(vec));
        System.out.println(combineVectors(sortByAsc(vec), sortByAsc(vec1)));
        System.out.println(mergeVectors(sortByAsc(vec), sortByAsc(vec1)));
    }

    public static Vector<Integer> createVector(int size) {
        Vector<Integer> vec = new Vector<>();
        for (int i = 0; i < size; i++) {
            vec.add(rnd.nextInt(0, 100));
        }
        return vec;
    }

    public static int getEvenNumbers(Vector<Integer> vec) {
        if (vec == null) {
            return -1;
        }
        int counter = 0;
        for (Integer x : vec) {
            if (x % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getSmallestNumbers(Vector<Integer> vec) {

        int minnumber = Integer.MAX_VALUE;
        for (int i = 0; i < vec.size(); i++) {
            if (minnumber > vec.get(i)) {
                minnumber = vec.get(i);
            }
        }
        return minnumber;
    }

    public static int getBiggestNumber(Vector<Integer> vec) {
        int maxnumber = Integer.MIN_VALUE;
        for (int i = 0; i < vec.size(); i++) {
            if (maxnumber < vec.get(i)) {
                maxnumber = vec.get(i);
            }
        }
        return maxnumber;
    }

    public static Vector<Integer> sortByAsc(Vector<Integer> vec) {
        for (int i = 0; i < vec.size(); i++) {
            for (int j = 0; j < vec.size() - i - 1; j++) {
                if (vec.get(j) > vec.get(j + 1)) {
                    Integer temp = vec.set(j, vec.get(j + 1));
                    vec.set(j + 1, temp);
                }
            }
        }
        return vec;
    }


    public static Vector<Integer> sortByDesc(Vector<Integer> vec) {
        int temp = 0;
        for (int i = 1; i < vec.size(); i++) {
            for (int j = 1; j < vec.size(); j++) {
                if (vec.get(j - 1) < vec.get(j)) {
                    temp = vec.get(j - 1);
                    vec.set(j - 1, vec.get(j));
                    vec.set(j, temp);
                }
            }
        }
        return vec;
    }

    public static Vector<Integer> deleteOddNumbers(Vector<Integer> vec) {
        for (int i = vec.size() - 1; i >= 0; i--) {
            if (vec.get(i) % 2 != 0) {
                vec.remove(i);
            }
        }
        return vec;
    }


    // TODO: merge of two Vector. See as merge sort by arrays tasks...
    public static Vector<Integer> combineVectors(Vector<Integer> vec, Vector<Integer> vec1) {
        Vector<Integer> newVec = new Vector<>();
        newVec.addAll(vec);
        newVec.addAll(vec1);
        Collections.sort(newVec);
        return newVec;
    }

    public static Vector<Integer> mergeVectors(Vector<Integer> a, Vector<Integer> b) {
        Vector<Integer> c = new Vector<>();

        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.firstElement() < b.firstElement()) {
                c.add(a.firstElement());
                a.removeFirst();
            } else {
                c.add(b.firstElement());
                b.removeFirst();
            }
        }
        while (!a.isEmpty()) {
            c.add(a.firstElement());
            a.removeFirst();
        }

        while (!b.isEmpty()) {
            c.add(b.firstElement());
            b.removeFirst();
        }

        return c;
    }
}
