package franco.week06.ListAndVector;

import java.util.ArrayList;
import java.util.Vector;

import static franco.week06.ListAndVector.DCVExercises.bubbleSortDSC;
import static franco.week06.ListAndVector.DCVExercises.randomNumberList;

public class DCVEX2 {
    public static void main(String[] args) {
        ArrayList<Integer> intlist1 = randomNumberList(10);
        ArrayList<Integer> intList2 = randomNumberList(10);

        System.out.println(intlist1 + "\n" + intList2);
        ArrayList<Integer> intList3 = mergeTwoList(intlist1, intList2);
        System.out.println(intList3);

//        int m = intlist1.size();
//        int n = intList2.size();
//        int pointer1 = m - 1, pointer2 = n - 1, i = m + n - 1;
//        while (pointer2 >= 0) {
//            if (pointer2 >= 0 && intlist1.get(pointer1) > intList2.get(pointer2)) {
//                intlist1.set(i--, pointer1--);
//            } else {
//                intlist1.set(i--, pointer2--);
//            }
//
//        }
//        System.out.println(intlist1 + "\n" + intList2);
    }

    public static ArrayList<Integer> mergeTwoList(ArrayList<Integer> intList1, ArrayList<Integer> intList2) {
        ArrayList<Integer> intList3 = new ArrayList<>();

        for (int index = 0; index < intList1.size(); index++) {
            intList3.add(intList1.get(index));
        }
        for (int i = 0; i < intList2.size(); i++) {
            intList3.add(intList2.get(i));
        }
        bubbleSortDSC(intList3);

        return intList3;
    }

    public static ArrayList<Integer> mergeTwoListV1(ArrayList<Integer> intList1, ArrayList<Integer> intList2) {
        ArrayList<Integer> intlist3 = new ArrayList<>();
        while (!intList1.isEmpty() || !intList2.isEmpty()) {
            if (intList1.getFirst() < intList1.getFirst()) {
                intlist3.add(intList1.getFirst());
                intList1.removeFirst();

            } else {
                intlist3.add(intList1.getFirst());
                intList2.removeFirst();
            } if(!intList1.isEmpty()){
                intlist3.addAll(intList1);
            }else{
                intlist3.addAll(intList2);
            }
        }
        return intlist3;
    }
}
