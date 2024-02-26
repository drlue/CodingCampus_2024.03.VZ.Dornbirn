package aki.week01.day01;

public class Day1 {
    public static void main(String[] args) {
        //Variable declaration
        int number;
        //initialization
        number = 3;
        System.out.println(number);

        //Declaration und initialization
        int number2 = 6;
        System.out.println(number2);
        long number5 = 10;

        //Floating point number double precision
        double number3 = 10.123;
        //Floating point number single preision
        float number4 = 10.23411f;

        boolean trueOrFalse = true;

        boolean numberIsBiggerTHanNumbe3 = number4 > number3;

        String name = "Aki";

        int zahl1 = 8;
        int zahl2 = 5;
        int sum = zahl1 + zahl2;
        System.out.println("Ergebnis von 8 + 5 = " + sum);

        int sum2 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + sum2);

        float sum3 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + sum3);

        float sum4 = (float) zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + sum4);

        int index = 0;
        //increment index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;

        System.out.println("Index: " + index);
        System.out.println("Index++: " + index++);
        System.out.println("Index after ++: " + +index);
        System.out.println("++Index: " + (++index));

        index += 2;
        index *= 2;
        index /= 2;
        index = index / 2;


        index = 0;

        while (index <= 10) {
            System.out.println("Current Index: " + index);
            index++;
        }

        for (int index2 = 0; index2 <= 10; index2++) {
            System.out.println("Current Index2: " + index2);
        }

        index = 0;
        do {
            System.out.println("Do While Current Index: " + index);
            index++;
        } while (index < -10);


    }
}
