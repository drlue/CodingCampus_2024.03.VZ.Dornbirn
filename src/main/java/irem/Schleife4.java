package irem;


public class Schleife4 {
    public static void main(String[] args) {

        for (int counter = 10; counter >= -10; --counter) {
            printCounter(counter);
        }
    }


    public static void printCounter(int counter) {
        System.out.println("Unsere Counter " + counter);
        if (counter % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }
    }
}