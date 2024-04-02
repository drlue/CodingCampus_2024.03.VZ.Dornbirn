package franco.week04;
import java.util.Scanner;


public class StringClass {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        //substring is a method
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);

        //Aufgabe string class
        System.out.println("Enter String 1:");
        String word = scan.nextLine();
        System.out.println("Enter String 2:");
        String word2 = scan.nextLine();
        System.out.println("== " + (word == word2));
        System.out.println("equals " + (word.equals(word2)));
        Integer number= 2;
        int number2=2;
        System.out.println(number.equals(number2));



        String newText= "unconditionally";
        int codePoint = newText.codePointAt(2);
        System.out.println(codePoint);





    }

}
