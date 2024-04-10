package lukas.week06.Example2;

import lukas.Helper;
import lukas.week06.Example1.CalcArrayInfo;

import java.util.Arrays;
import java.util.Random;

public class Example2 {


    public static void main(String[] args) {

        int[] myArr = Helper.randomArray(3, 3, 0, 100);
        System.out.println(Arrays.toString(myArr));

        MinMaxAvg mma = MinMaxAvg.getArrayInfo(myArr);

        System.out.println("----------Output with Methods-------------");
        System.out.printf("""
                Minimum: %d
                Maximum: %d
                Average: %f\s
                """, mma.getMinimum(), mma.getMaximum(), mma.getAverage());
        System.out.println("----------Output toString-------------");
        System.out.println(mma);

    }





}
