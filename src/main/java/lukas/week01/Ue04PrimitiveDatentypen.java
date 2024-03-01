package lukas.week01;

import java.sql.SQLOutput;

public class Ue04PrimitiveDatentypen {

    public static void main(String[] args) {

//        System.out.println("1! = ");
//        System.out.println(fakt(10));
//
//        System.out.println("Faktorielle 1! bis 20!");
//        printFakt(1, 20);
//
//        System.out.println("Faktorielle 1! bis 20! besser formatiert");
//        printfFakt(1, 20);

        System.out.println("Von 0 bis 100 Zählen in 0.1er Schritten");
        countTo100inPointOneSteps();

    }

    public static long fakt(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result = i * result;
        }
        return result;
    }

    public static void printFakt(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(fakt(i));
        }
    }

    public static void printfFakt(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%25.3f %n", (float) fakt(i));
        }
    }

    public static void countTo100inPointOneSteps (){
        for (double i = 0; i < 100; i+=0.1) {
            System.out.println(i);
        }
    }
    public static void countTo100inPointOneSteps2 (int num){
            for (int i = 0; i < num*10; i+=1) {
            System.out.println((double)i/10);
        }
    }
}
