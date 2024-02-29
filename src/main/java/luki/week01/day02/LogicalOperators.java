package luki.week01.day02;

import java.util.Random;

public class LogicalOperators {
    public static void main(String[] args) {
        Random random = new Random();
        boolean a = random.nextBoolean();
        boolean b = random.nextBoolean();
        boolean c = random.nextBoolean();

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);

        if(a && b) {
            System.out.println("A and B are true");
        }

        if(a || b) {
            System.out.println("A or B is true");
        }

        if(1 > 5) {

        }

        //Wenn a und b wahr, oder c wahr
        if(c || (a && b)) {
            System.out.println("SUPER");
        } else {
            System.out.println("NOT SUPER");
        }

        System.out.println(5 + 2 * 3);
        System.out.println(5 + (2 * 3));

        if(c || a && b) {
            System.out.println("SUPER2");
        } else {
            System.out.println("NOT SUPER2");
        }

        //Wenn c nicht wahr
        if(!c) {
            System.out.println("C ist nicht wahr");
        }

        if(c == false) {
            System.out.println("C ist immer noch nicht wahr");
        }

        if(c != true) {
            System.out.println("C ist wirklich immer noch nicht wahr");
        }

        if(c) {
            //noop
        } else {
            System.out.println("C ist wirklich richtig wirklich immer noch nicht wahr");
        }

        boolean condition = false;
        if(condition) {

        } else {
            System.out.println("Condition ist auch nicht wahr");
        }
    }
}
