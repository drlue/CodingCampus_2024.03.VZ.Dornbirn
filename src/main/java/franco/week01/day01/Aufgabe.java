package franco.week01.day01;

public class Aufgabe {
    public static void main(String[] args) {

        //Aufgabe 1
        System.out.println("Hello world");

        System.out.println("      /__\\   ");
        System.out.println("     / /\\ \\  ");
        System.out.println("    / /  \\ \\   ");
        System.out.println("   / /    \\ \\   ");
        System.out.println("  /  =====   \\     ");
        System.out.println(" /_/        \\_\\    ");


        //Augfagbe 2


        for (int num1 = 0; num1 <= 10; num1++) {
            System.out.println("For loops number is: " + num1);

        }

        int num = 0;
        while (num <= 10) {
            System.out.println("While number is: " + num);
            num++;
        }

        for (int num2 = 0; num2 < 10; num2++) {
            System.out.println("New number for loop number excl.10: " + num2);
        }

        //Aufgabe mit tricks
        for (int num3 = 0; num3 < 10; num3++) {
            if (num3 % 2 == 0) {
                System.out.println("Gerade nummer: " + num3);
            }

        }

        for (int num4 = 10; num4 > -11; num4--) {
            System.out.println("Tricky number :" + num4);
        }

        for (int num5 = 0; num5 <= 10; num5 +=2){
            System.out.println("Divisable number without if: " + num5);
        }


    }
}
