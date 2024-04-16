package aki.week04;

import java.util.Random;
import java.util.Scanner;

public class CharRandomize2 {

    public static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("Ausgabe: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char[] swap = userInput.toCharArray();

        for (int count = 0; count < 10 + 3*userInput.length(); count++) {
            int swapIndexLhs = random.nextInt(swap.length);
            int swapIndexRhs = random.nextInt(swap.length);
            char temp = swap[swapIndexLhs];
            swap[swapIndexLhs] = swap[swapIndexRhs];
            swap[swapIndexRhs] = temp;
        }
        String shuffledUserInput = new String(swap);
        System.out.println(shuffledUserInput + " = " + userInput);
    }
}
