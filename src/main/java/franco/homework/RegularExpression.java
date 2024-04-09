package franco.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
      /*
      first exampple
        Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
        Matcher matcher = pattern.matcher("agent 007");
      //  \\d is for digit in bracket mean it should be at least 3 digit
       Pattern pattern1 =Pattern.compile("\\d{3}");

        boolean found=(matcher.find());
        System.out.println("Found: "+found);

        if (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
        */

        String cardNumber = "1234-2342-2333-3434";
        //XXXX-XXXX-XXXX-3434 print ouput this number
        Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher= pattern.matcher(cardNumber);
        String maskedCardNum = matcher.replaceAll("XXXX-XXXX-XXXX-");
        System.out.println(maskedCardNum);
        System.out.println("Please write down a txt");
        Scanner scan= new Scanner(System.in);
        String tryOut= scan.nextLine().trim();
        System.out.println(tryOut);
        String []array = tryOut.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("x");
            System.out.println();
        }
        System.out.println(Arrays.toString(array));



    }
}
