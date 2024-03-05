package lukas.week01;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Random;

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
        System.out.println("Divide et Impera");
        DivideEtImpera();
//
//        System.out.println("Berechnung Pi mit Leibnitz Reihe");
//        calculatePiLeibnitz(6);
//
//        System.out.println("Berechnung Pi mit Nilakantha Reihe");
//        calculatePiNilakantha(6);
//
//        System.out.println("Berechnung Pi mit Nilakantha Reihe - Solution 2");
//        calculatePiNilakantha2(0.000001);

//        System.out.println("Die geheime Reihe konvergiert gegen:");
//        calculateSecretRow(0.0001);

//        double random = new Random().nextInt(10000) + 1;
//        System.out.println("Wurzelnäherung für Wurzel aus " + random);
//        approxSqrt(random, 0.0001);
//
//        double v = 1297419;
//        System.out.println("Wurzelnäherung für Wurzel aus " + v);
//        approxSqrt2(v, 0.001);
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
            //System.out.printf("%25.3f \n", (float) fakt(i));
            System.out.printf("%2d! = %25d \n", i, fakt(i));
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
            System.out.printf("%-6.2f \n", i);
        }
    }

    public static void DivideEtImpera() {
        for (int x = 0; x < 20; x++) {
//            System.out.print(x / 5);
//            System.out.print("       ");
//            System.out.print(x / 5.0);
//            System.out.println();

            System.out.printf("%s %10.2f \n", x/5, x/5.0);
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

    public static double calculatePiLeibnitz2(int precisionExp) {
        double pi1;
        double pi2 = 0.0;
        int i = 0;
        do {
            pi1 = pi2;
            if (i % 2 == 0) {
                pi2 += 4.0 / (2 * i + 1);
            } else {
                pi2 -= 4.0 / (2 * i + 1);
            }
            //System.out.println(pi2);
            i++;
        } while (Math.abs(pi2 - pi1) >= Math.pow(10, -precisionExp));
        return pi2;
    }

    public static double calculatePiLeibnitz3(double precision) {
        double nenner = 1;
        double piMin = 0;
        double piMax = 4;
        while (piMax - piMin > precision) {
            piMax = piMin + (4 / nenner);
            nenner += 2;
            piMin = piMax + (4 / nenner);
            nenner += 2;
        }
        return piMin;
    }


    public static void calculatePiNilakantha(int precisionExp) {
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
        } while (Math.abs(pi2 - pi) >= Math.pow(10, -precisionExp));
        System.out.println("Berechnung von pi mit Fehler kleiner als " + Math.pow(10, -precisionExp) + " in " + i + " Durchgängen");
        System.out.print("\u001B[32m" + Double.toString(pi2).substring(0, precisionExp + 2));
        System.out.println("\u001B[31m" + Double.toString(pi2).substring(precisionExp + 2) + "\u001B[0m");
        System.out.println("Kontrolle:");
        System.out.println(Math.PI);

    }

    public static void calculatePiNilakantha2(double precision) {
        long nenner = 2;
        double pi1 = 4.0;
        double pi2 = 3.0;
        while (pi1 - pi2 > precision) {
            pi1 = pi2 + 4.0 / (nenner * (nenner + 1) * (nenner + 2));
            nenner += 2;
            pi2 = pi1 - 4.0 / (nenner * (nenner + 1) * (nenner + 2));
            nenner += 2;
        }
        System.out.println(pi2);
    }

    public static void calculateSecretRow(double precision) {
        double a = 0.0;
        double b = 1.0;
        System.out.println();
        while (Math.abs(b - a) >= precision) {
            a = b;
            b = a / 2 + 1 / a;
        }

        System.out.println("Näherung von wurzel(2) mit Fehler kleiner als " + precision);
        System.out.println(b);
        System.out.println("Kontrolle:");
        System.out.println(Math.sqrt(2));
    }


    public static void approxSqrt(double value, double precision) {
        double minVal = 0;
        double maxVal = value;
        while (maxVal - minVal > precision) {
            double tempVal = (maxVal + minVal) * 0.5;
            if (tempVal * tempVal > value) {
                maxVal = tempVal;
            } else {
                minVal = tempVal;
            }
            //System.out.println(tempVal);
        }
        System.out.println("Fehler < " + precision);
        System.out.println(maxVal);
        System.out.println("Kontrolle:");
        System.out.println(Math.sqrt(value));
    }

    public static void approxSqrt2(double value, double precisionInPercent) {
        precisionInPercent = Math.abs(precisionInPercent);
        double minVal = 0;
        double maxVal = Math.abs(value);
        int i = 1;
        while ((maxVal - minVal) / maxVal * 100 > precisionInPercent) {
            double tempVal = (maxVal + minVal) * 0.5;
            if (tempVal * tempVal > Math.abs(value)) {
                maxVal = tempVal;
            } else {
                minVal = tempVal;
            }
            double diffPercent = (maxVal - minVal) / maxVal * 100;

            System.out.println("i: " + i);
            System.out.printf("maxVal: %10f \n", maxVal);
            System.out.printf("minVal: %10f \n", minVal);
            System.out.printf("Fehler: %10f%%  \n", diffPercent);
            System.out.println("-------------------------------");

            i++;

        }
        System.out.println("Fehler < " + precisionInPercent + "% nach " + (i - 1) + " Durchgängen");

        if (value < 0) {
            System.out.println(maxVal + "*i");
        } else {
            System.out.println(maxVal);
        }
        System.out.println("Kontrolle:");
        System.out.println(Math.sqrt(value));
    }

}
