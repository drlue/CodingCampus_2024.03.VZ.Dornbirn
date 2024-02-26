package franco.week01.day01;

public class AufgabePrint {
    public static void main(String[] args) {


        printChars("x", 10);


    }

    public static void printChars(String text, int zahl) {

        for (int i = 0; i < zahl; i++) {
            System.out.print(text);
        }

    }
}