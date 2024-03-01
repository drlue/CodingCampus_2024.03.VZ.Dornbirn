package ardijanla.week01.day04;

import java.util.function.IntPredicate;

public class LogischeOperatoren {
    public static void main(String[] args) {
        task();
        for (int i = 0; i < 15; i++) {
            System.out.println(i + " " + isBiggerThanThreeAndEvenOrEleven(i));
        }

        task();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + task1(i));
        }

        task();
        for (int i = 0; i < 105; i++) {
            System.out.println(i + " " + task2(i));
        }

        task();
        for (int i = -20; i < 10; i++) {
            System.out.println(i + " " + task3(i));
        }

        task();
        for (int i = -10; i < 5; i++) {
            System.out.println(i + " " + task4(i));
        }

        task();
        for (int i = 0; i < 110; i++) {
            System.out.println(i + " " + task5(i));
        }

        task();
        for (int i = 0; i < 40; i++) {
            System.out.println(i + " " + task6(i));
        }

        task();
        for (int i = 1700; i < 4000; i += 100) {
            System.out.println(i + " " + task7(i));
        }

        task();
            System.out.println(task8(1,10,2));



    }

    static int taskCounter;

    public static void task() {
        String task = "Aufgabe: ";
        System.out.println(task + taskCounter++);
        ;
    }

    public static boolean isBiggerThanThreeAndEvenOrEleven(int num) {
        return num > 3 && num % 2 == 0 || num == 11;
    }

    public static boolean task1(int num) {
        return num % 2 == 0 && num > 10;
    }

    public static boolean task2(int num) {

        if (num < 5) {
            return true;
        } else if (num > 100) {
            return true;
        }

        return false;
    }

    public static boolean task3(int num) {

        if (!(num < 0) && (num % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task4(int num) {

        if (num < 0 && num != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task5(int num) {

        if (num >= 5 && num <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task6(int num) {
        boolean divideableBy3Or16 = num % 3 == 0 || num % 16 == 0;
        boolean divideableBy32 = num % 32 == 0;

        if (num % 32 == 0) {
            return false;
        }
        if (num % 3 == 0) {
            return true;
        }
        return num % 16 == 0;


//        if (divideableBy3Or16 && !divideableBy32) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static boolean task7(int num) {
        boolean exeption = (num % 100 == 0) && (num % 400 != 0);
        boolean schaltjahr = (num % 4 == 0);

        if (schaltjahr && !exeption) {
            return true;
        } else{
            return false;
        }
    }


    public static boolean task8(int lowerLimit,int upperLimit,int value){
        boolean condition = (value >= lowerLimit && value <= upperLimit);
        if (condition){
            return true;
        }else {
            return false;
        }

    }


}
