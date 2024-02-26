package ardijanla.week01.day01;

public class Day1 {
    public static void main(String[] args) {
        //Variable declaration
        int number;
        //initialization
        number = 3;
        System.out.println(number);

        //Declaration and initialization
        int number2 = 6;
        System.out.println(number2);
        long number5 = 10;

        //Floating point number double precision
        double number3 = 10.123;
        //Floating point number single precision
        float number4 = 10.1234F;

        boolean trueOrFalse = true;

        String name = "Lukas";


        //addiere zwei variablen und gebe das ergebnis aus
        int number8, number9, sum;
        number8 = 10;
        number9 = 20;
        sum = number8 + number9;
        System.out.println("Ergebnis ist" + sum);


        int sum2 = number8 / number9;
        System.out.println("Ergebnis ist" + sum2);

        float sum3 = number8 / number9;
        System.out.println("Ergebnis ist" + sum3);

        float sum4 = (float)number8 / number9;
        System.out.println("Ergebnis ist" + sum4);

        int index = 0;
        //increment index by 1
        index++;
        index+=1;
        index = index + 1;
        ++index;

        System.out.println("Index: " + index);
        System.out.println("Index++ " + index++);
        System.out.println("++Index: " + (++index));

        index += 2;
        index *= 2;
        index /= 2;
        index = index / 2;



        index = 0;
        while (index <= 10){
            System.out.println("current index: " + index);
            index++;
        }

        for (int index2 = 0; index2 <= 10; index2++) {
            System.out.println("current index: " + index2);
        }

        index = 0;

        do{
            System.out.println("current index: " + index);
            index++;
        }while(index <= 10);




    }
}
