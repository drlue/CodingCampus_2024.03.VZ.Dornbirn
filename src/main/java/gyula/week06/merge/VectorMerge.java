package gyula.week06.merge;

import java.util.Random;
import java.util.Vector;

public class VectorMerge {
    private static Random rand = new Random();
    public static void main(String[] args) {
        Vector<Integer> v1 = createRandomValues(4);
        Vector<Integer> v2 = createRandomValues(8);
        System.out.println(v1);
        System.out.println(v2);

        Vector<Integer> combined = mergeVector(v1, v2);
        System.out.println(combined);
    }

    private static Vector<Integer> mergeVector(Vector<Integer> left, Vector<Integer> right){
        Vector<Integer> result = new Vector<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.firstElement() < right.firstElement()) {
                result.add(left.remove(0));
            } else {
                result.add(right.remove(0));
            }
        }
        result.addAll(left);
        result.addAll(right);
        return result;
    }

    private static Vector<Integer> createRandomValues(int count){
        Vector<Integer> result = new Vector<>();
        Integer seed = 0;
        for (int i = 0; i < count; i++) {
            seed += rand.nextInt(1, 20);
            result.add(seed);
        }
        return result;
    }

}
