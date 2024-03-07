package christian.week02.day04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class tryCatchTryOut {
    public static void main(String[] args) {
        //System.out.println(inputReaderIntOut());
        System.out.println(inputReaderIntOutTryCatch());
    }

    public static int inputReaderIntOut() {
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.println("Bitte gib eine Ganzzahl ein:");
            sc.nextLine();
        }
        number = sc.nextInt();
        return number;
    }

    public static int inputReaderIntOutTryCatch() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.println("Gib eine Zahl ein:");
                number = sc.nextInt();
                return number;
            } catch (InputMismatchException mismatchException) {
                System.out.println("Das war keine Zahl!!");
                sc.nextLine();
            } catch (NoSuchElementException noSuchElementException){
                System.out.println("Etwas ist schief gelaufen");
            }
        }
    }
}

