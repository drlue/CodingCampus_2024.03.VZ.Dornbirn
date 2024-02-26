package lukas.week01.day01;

public class Day1 {
    public static void main(String[] args) {
        //Variable declaration
        int number;
        //Initialization
        number = 10;
        System.out.println(number);

        //Declaration and initialization
        int number2 = 6;
        System.out.println(number2);
        long number5 = 10;

        //Floating point number double precision
        double number3 = 10.123;
        //Floating point number single precision
        float number4 = 10.1234f;
        System.out.println(number3);

        boolean trueOrFalse = true;
        boolean number4IsBiggerThanNumber3 = number4 > number3;

        String name = "Lukas";

        int zahl1 = 8;
        int zahl2 = 5;
        int sum = zahl1 + zahl2;
        System.out.println("Summe 8 + 5 = " + sum);

        //int / int ergeibt int
        int div1 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + div1);

        //int / int ergibt immer noch eine Ganzzahl, aber halt als float angezeigt 1.0
        float div2 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + div2);

        //Casting
        float div3 = (float) zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + div3);

        int index = 0;
        //increment index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;

        System.out.println("Index;  " + index);
        System.out.println("Index++;  " + index++);
        System.out.println("Index after ++;  " + index);
        System.out.println("++Index;  " + (++index));

        //decrement
        index += 2;
        index -= 2;
        index *= 2;
        index /= 2;

        //While - Schleife
        index = 0;
        while (index <= 10) {
            System.out.println("Current Index " + index);
            index++;
        }

        //For-Schleife
        for (int index2 = 0; index2 <= 10; index2++) {
            System.out.println("Current Index2: " + index2);
        }

        //Do-While-Schleife
        index = 0;
        do {
            System.out.println("Do While Current Index: " + index);
            index++;
        } while (index < -10);


    }
}
