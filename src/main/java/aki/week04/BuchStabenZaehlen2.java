package aki.week04;

import java.util.Scanner;

public class BuchStabenZaehlen2 {
    public static void main(String[] args) {
        System.out.println("Gibt was ein!: ");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] userText = text.toCharArray();
        int[] alphabet = new int[1000];

        for (int i = 0; i < userText.length; i++) {
            alphabet[userText[i]]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            int result = alphabet[i];
            if(result > 0) {
                System.out.println((char)i+" "+result);
            }
        }
    }
}
