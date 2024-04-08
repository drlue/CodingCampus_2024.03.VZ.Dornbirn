package aki.week04;

import java.util.Random;
import java.util.Scanner;

public class CharRandomize2 {
    public static void main(String[] args) {
        for (char a = 0; a <= 'Z'; a++) {
            System.out.println(a + " -> " + (int) a);
        }
        System.out.println("Ausgabe: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char[] swap = userInput.toCharArray();
        System.out.println(swap[2]);

        Random random = new Random();

        for (int i = 0; i < swap.length; i++) {
            int swapIndexLhs = random.nextInt(swap.length);
            int swapIndexRhs = random.nextInt(swap.length);
            char temp = swap[swapIndexLhs];
            swap[swapIndexLhs] = swap[swapIndexRhs];
            swap[swapIndexRhs] = temp;
        }
        String shuffledUserInput = new String(swap);
        System.out.println(shuffledUserInput + " l " + userInput);
    }
}
