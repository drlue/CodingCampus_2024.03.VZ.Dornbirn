package ardijanla.week06.Permutation;

import java.util.Vector;

public class CalcalutePermutation {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");
        vec.add("D");
        System.out.println(calcPermutation(vec));


    }


    public static int calcPermutation(Vector<String> vec) {

        int value = 1;
        for (int i = 1; i < vec.size() + 1; i++) {
            value = value * i;
        }

        return value;

    }

}
