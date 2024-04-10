package lukas.week06.Example1_ArrayInfo;

import lukas.Helper;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        int[] myArr = Helper.randomArray(3, 3, 0, 100);
        System.out.println(Arrays.toString(myArr));

        CalcArrayInfo calcArrayInfo = new CalcArrayInfo(myArr);
        System.out.println("Min: " + calcArrayInfo.calcMin());
        System.out.println("Max: " + calcArrayInfo.calcMax());
        System.out.println("Avg: " + calcArrayInfo.calcAvg());

        System.out.println("--------------toString----------------");
        System.out.println(calcArrayInfo.toString());



    }
}
