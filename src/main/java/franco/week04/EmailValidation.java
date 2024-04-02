package franco.week04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public static Scanner scan = new Scanner(System.in);
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static void main(String[] args) {
        /////////Manually input//////
        System.out.println(patternMatches("Vincentjb07@hotmail.com",
                "[A-Za-z0-9]+(.[A-Za-z0-9]+)*@([A-Za-z0-9].)+[A-Za-z0-9]+"));
        /////////userInput//////
        System.out.println(emailInput());
    }

    //Maually input regex
    public static boolean patternMatches(String emailAddr, String regexPattern) {
        return Pattern.compile(regexPattern).matcher(emailAddr).matches();
    }
    public static boolean emailValid(String email) {
        String regex = "[A-Za-z0-9]+(.[A-Za-z0-9]+)*@([A-Za-z0-9].)+[A-Za-z0-9]+";
        return email.matches(regex);
    }

    public static String emailInput() {
        boolean valid = false;
        String email="";
        while(!valid) {
            System.out.print("Enter a valid email adresse please:\n");
            email = scan.nextLine();
            if (emailValid(email)) {
                System.out.println("valid email adresse:");
                valid=true;
            } else {
                System.out.println("Not valid");
            }
        }
        return (email+BLUE_BOLD);

    }
}
