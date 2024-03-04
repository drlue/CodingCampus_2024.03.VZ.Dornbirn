package ardijanla.week01.day05;

import ardijanla.ConsoleColors;

import java.awt.*;
import java.io.Console;
import java.math.BigInteger;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

        System.out.println("Fakul");
        System.out.println(fakul(10));

        System.out.println("Fakul1");
        fakul1(10);

        System.out.println("Fakul2");
        fakul2(20);

        System.out.println("Count To 100");//
        countTo100();

        System.out.println("Count To 100 Extended");
        countTo100Extended();

        System.out.println("Teilen und Herrschen");
        teilenUndHerrschen();

        System.out.println("Calc Leibniz");
        calculatePiLeibniz();
        System.out.println("Calc Leibniz von Christian");
        CalucalateChristian();

        System.out.println("Calucalte nilakantha");
        calculatePiNilakantha();

        System.out.println("Secret Row");
        SecretRow();
    }

    //Erstelle eine Methode die die Fakultät einer beliebigen Zahl berechnet und zurückgibt.
    public static long fakul(int num) {
        long n = 1;
        for (int i = 1; i <= num; i++) {
            n = (n * i);
        }
        return n;
    }

    //Erstelle eine Methode, die von 1 bis 20 alle Fakultäten berechnet und ausgibt. Es soll die Methode der vorhergehenden Übung verwendet werden.
    public static void fakul1(int num) {
        for (int i = 1; i < num; i++) {
            System.out.println(fakul(i));
        }
    }

    //Erweitere deine Ausgabe der vorhergehenden Übung so, dass die die Werte rechtsbündig ausgegeben werden. Verwende die System.out.printf() Funktion.
    public static long fakul2(int num) {

        long n = 1;
        for (int i = 1; i <= num; i++) {
            n = (n * i);
            System.out.printf("%2d! =  %19d\n", i, n);
        }
        return n;
    }


    //Erstelle eine Methode, die von 0 bis 100 in 0.1er Schritten zählt, und alle Werte ausgibt.

    public static void countTo100() {

        for (int i = 0; i <= 1000; i++) {

            double value = i / 10.0;

            System.out.println(value);
        }
    }

    //Formatiere deine Ausgabe. Verwende hierfür System.out.printf().
    //
    //Probiere verschiedenen Formatierungsoptionen z.B. "%5.1f" oder "%-6.2f" aus.
    public static void countTo100Extended() {
        for (int i = 0; i <= 1000; i++) {
            double value = i / 10.0;

            System.out.printf("%-1.2f\n", value);
        }
    }

    //Aufgabe: Teilen und Herrschen
    //Erstelle eine Methode, die von 0 bis 20 zählt und die folgende Daten ausgibt:
    public static void teilenUndHerrschen() {

        for (int i = 0; i <= 20; i++) {

            System.out.println();
            System.out.print(ConsoleColors.RED + "Zähler = " + i);
            System.out.print(ConsoleColors.BLUE + " |Zähler durch 5 = " + i / 5);
            System.out.print(ConsoleColors.PURPLE + " |Zähler durch 5.0 = " + i / 5.0);
            System.out.println();

        }
        System.out.println(ConsoleColors.RESET);

    }

    //Bonusaufgabe: Berechnung von Pi (Leibniz Reihe)
    //Rechne die Annäherung von Pi mit der Formel π = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...

    public static void calculatePiLeibniz() {
        double pi = 0.000f;
        double nenner = 4;

        for (long i = 1; i <= 100000000; i += 4) {
            pi += (nenner / i) - (nenner / (i + 2));
        }
        System.out.println(pi);


    }


    //Bonusaufgabe: Berechnung von Pi (Leibniz Reihe)
    //Rechne die Annäherung von Pi mit der Formel π = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...
    public static void CalucalateChristian() {
        double pi = 0.000;
        double zaehler = 4;
        double nenner = 1;

        for (int i = 0; i <= 250000000; i++) {
            pi += (zaehler / nenner);
            nenner += 2;
            pi -= (zaehler / nenner);
            nenner += 2;
        }

        System.out.println(pi);
    }

    //Bonusaufgabe: Berechnung von Pi (Nilakantha Reihe)
    //Rechne die Annäherung von Pi mit der Formel π = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + 4/(10*11*12) - 4/(12*13*14)
    public static void calculatePiNilakantha() {
        double cont = 4;
        double pi = 3;
        double num1 = 2;
        double num2 = 3;
        double num3 = 4;

        for (int i = 0; i < 1000; i++) {

            pi += cont / (num1 * num2 * num3);

            num2 += 2;
            num1 = num3;
            num3 += 2;


            pi -= cont / (num1 * num2 * num3);

            num1 = num3;
            num3 += 2;
            num2 += 2;

        }

        System.out.println(pi);
    }

    //Bonusaufgabe: Geheime Reihe
    public static void SecretRow() {
        double num = 1.0;


        for (int i = 0; i < 100; i++) {
            num = num / 2 + 1/  num;
            System.out.println(num);
        }

    }



}
