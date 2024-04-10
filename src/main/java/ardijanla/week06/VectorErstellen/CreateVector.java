package ardijanla.week06.VectorErstellen;

import javax.swing.*;
import java.util.Random;
import java.util.Vector;

public class CreateVector {
    static Random rnd = new Random();
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        for (int i = 0; i < 20; i++) {
            vec.add(rnd.nextInt(0,100));
        }
        System.out.println(vec);
        getSmallestNumbers(vec);
        System.out.println(        getSmallestNumbers(vec)
);
    }

    public static int getEvenNumbers(Vector<Integer> vec ){
        int counter = 0;
        for (Integer x: vec){
            if (x % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int getSmallestNumbers(Vector<Integer> vec){

        int minnumber = Integer.MAX_VALUE;
        for (int i = 0; i < vec.size(); i++) {
            if (minnumber > vec.get(i)){
                minnumber = vec.get(i);
            }
        }
        return minnumber;
    }

    public static int getBiggestNumber(Vector<Integer> vec){
        int maxnumber = Integer.MIN_VALUE;
        for (int i = 0; i < vec.size(); i++) {
            if (maxnumber > vec.get(i)){
                maxnumber = vec.get(i);
            }
        }
        return  maxnumber;
    }
}
