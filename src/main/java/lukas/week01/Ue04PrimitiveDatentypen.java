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

//        System.out.println("Von 0 bis 100 Zählen in 0.1er Schritten");
//        countTo100inPointOneSteps(5);

//        System.out.println("Von 0 bis 100 Zählen in 0.1er Schritten - Solution 2");
//        countTo100inPointOneSteps2(5);
//
//        System.out.println("Von 0 bis 100 Zählen in 0.1er Schritten - Solution 3 (Formatiert)");
//        countTo100inPointOneSteps3(5);
//
//        System.out.println("Divide et Impera");
//        DivideEtImpera();

        System.out.println("Berechnung Pi mit Leibnitz Reihe");
        calculatePiLeibnitz(3);

    }

    public static long fakt(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
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

    public static void countTo100inPointOneSteps (int num){
        for (double i = 0; i < num; i+=0.1) {
            System.out.println(i);
        }
    }
    public static void countTo100inPointOneSteps2 (int num){
            for (int i = 0; i < num*10; i+=1) {
            System.out.println((double)i/10);
        }
    }

    public static void countTo100inPointOneSteps3 (int num) {
        for (double i = 0; i < num; i += 0.1) {
//            System.out.printf("%5.2f %n", i);
            System.out.printf("%-6.2f %n", i);
        }
    }

    public static void DivideEtImpera(){
        for (int x = 0; x < 20; x++) {
            System.out.print(x/5);
            System.out.print("       ");
            System.out.print(x/5.0);
            System.out.println();
        }
    }

    public static void calculatePiLeibnitz(int precision){
        double pi = 0;
        double pi2 = 0;
        int i=0;
        System.out.println();
//        while (Math.abs(pi2-pi)<= Math.pow(10,-precision)) {
//            if (i%2==0) {
//                pi2 += 4.0/(2*i+1);
//            }
//            else {
//                pi2 -= 4.0/(2*i+1);
//            }
//            System.out.println(pi);
//            pi = pi2;
//            i++;
//        }
    }
}
