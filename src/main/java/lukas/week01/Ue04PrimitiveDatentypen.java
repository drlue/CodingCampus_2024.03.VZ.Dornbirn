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
//
//        System.out.println("Berechnung Pi mit Leibnitz Reihe");
//        calculatePiLeibnitz(6);
//
//        System.out.println("Berechnung Pi mit Nilakantha Reihe");
//        calculatePiNikalantha(6);

        System.out.println("Die geheime Reihe konvergiert gegen:");
        calculateSecretRow(5);
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

    public static void countTo100inPointOneSteps(int num) {
        for (double i = 0; i < num; i += 0.1) {
            System.out.println(i);
        }
    }

    public static void countTo100inPointOneSteps2(int num) {
        for (int i = 0; i < num * 10; i += 1) {
            System.out.println((double) i / 10);
        }
    }

    public static void countTo100inPointOneSteps3(int num) {
        for (double i = 0; i < num; i += 0.1) {
//            System.out.printf("%5.2f %n", i);
            System.out.printf("%-6.2f %n", i);
        }
    }

    public static void DivideEtImpera() {
        for (int x = 0; x < 20; x++) {
            System.out.print(x / 5);
            System.out.print("       ");
            System.out.print(x / 5.0);
            System.out.println();
        }
    }

    public static void calculatePiLeibnitz(int precision) {
        double pi = 0.0;
        double pi2 = 0.0;
        int i = 0;
        System.out.println();
        do {
            pi = pi2;
            if (i % 2 == 0) {
                pi2 += 4.0 / (2 * i + 1);
            } else {
                pi2 -= 4.0 / (2 * i + 1);
            }
            //System.out.println(pi2);
            i++;
        } while (Math.abs(pi2 - pi) >= Math.pow(10, -precision));
        System.out.println("Berechnung von pi mit Fehler kleiner als " + Math.pow(10, -precision) + " in " + i + " Durchgängen");
        System.out.print("\u001B[32m" + Double.toString(pi2).substring(0, precision + 2));
        System.out.println("\u001B[31m" + Double.toString(pi2).substring(precision + 2) + "\u001B[0m");
        System.out.println("Kontrolle:");
        System.out.println(Math.PI);
    }

    public static void calculatePiNilakantha(int precision) {
        double pi = 0.0;
        double pi2 = 3.0;
        int i = 0;
        System.out.println();
        do {
            pi = pi2;
            double nenner = (2 * i + 2) * (2 * i + 3) * (2 * i + 4);
            if (i % 2 == 0) {
                pi2 += 4.0 / nenner;
            } else {
                pi2 -= 4.0 / nenner;
            }
            //System.out.println(pi2);
            i++;
        } while (Math.abs(pi2 - pi) >= Math.pow(10, -precision));
        System.out.println("Berechnung von pi mit Fehler kleiner als " + Math.pow(10, -precision) + " in " + i + " Durchgängen");
        System.out.print("\u001B[32m" + Double.toString(pi2).substring(0, precision + 2));
        System.out.println("\u001B[31m" + Double.toString(pi2).substring(precision + 2) + "\u001B[0m");
        System.out.println("Kontrolle:");
        System.out.println(Math.PI);

    }

    public static void calculateSecretRow(int precision) {
        double a = 1.0;
        double b = 1.0;
        int i = 0;
        System.out.println();
        do {
            a=b;
            b = a/2 + 1/a;
            System.out.println(b);
            i++;
        } while (Math.abs(b - a) >= Math.pow(10, -precision));
        System.out.println(b);
        System.out.println("Berechnung von wurzel(2) mit Fehler kleiner als " + Math.pow(10, -precision) + " in " + i + " Durchgängen");
        System.out.println(b);
        System.out.println("Kontrolle:");
        System.out.println(Math.sqrt(2));
    }


    public static void approxSqrt(){}
}
