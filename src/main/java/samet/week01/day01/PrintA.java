package samet.week01.day01;

public class PrintA {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("       / /-\\");
        System.out.println("      / /   \\ \\ ");
        System.out.println("     / /     \\ \\ ");
        System.out.println("    / /       \\ \\ ");
        System.out.println("   /  =======  \\ \\ ");
        System.out.println("  / _/          \\_\\ ");

        //Aufgabe 2

        for (int num1 = 0; num1 <= 10; num1++) {
            System.out.println("For loops number is: " + num1);

        }

        for (int num1 = 0; num1 >= 10; num1++) {
            System.out.println("For loops number is: " + num1);


        }

        for (int num1 = 0; num1 < 10; num1++) {
            System.out.println("Runde: " + num1);

        }

        for (int num1 = 0; num1 <= 10; num1++) {
            if (num1 % 2 == 0) {
                System.out.println(num1);


            }


        }

        int num1 = 10;
        int num2 = -11;
        while (num1 > num2) {
            System.out.println("Countdown: " + num1);
            num1--;

        }


    }
}


