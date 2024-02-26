package ardijanla.week01.day01;

public class UebungZaehlen {

    public static void main(String[] args) {

        CountToFor(10);
        CountToWhile(10, true, true);
        CountBackwards(10);

    }


    public static void CountToFor(int numberToCount) {

        for (int i = 0; i <= numberToCount; i++) {
            System.out.println("number: " + i);
        }
    }

    public static void CountToWhile(int numberToCount, boolean exklusiveLastNumber, boolean OnlyOdd) {
        if (!exklusiveLastNumber) {
            numberToCount--;
        }

        int counter = 0;
        while (counter <= numberToCount) {

            if (counter % 2 == 0 && OnlyOdd) {

                System.out.println("number: " + counter);
            } else if (!OnlyOdd) {
                System.out.println("odd number: " + counter);
            }
            counter++;
        }
    }

    public static void CountBackwards(int numberToCount) {
        for (int i = numberToCount; i >= -10; i--) {
            System.out.println(i);
        }
    }
}
