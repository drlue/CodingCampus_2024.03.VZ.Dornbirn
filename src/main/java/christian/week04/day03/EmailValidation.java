package christian.week04.day03;

import java.util.Scanner;

public class EmailValidation {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean valid = false;

        while (!valid) {
            System.out.println("Gib eine gültige Emailadresse ein:");
            valid = emailValidation(emailInput());
        }

        System.out.println("Die Emailadresse ist gültig!");
    }

    public static String emailInput() {
        boolean valid = false;
        String email = "";

        while (!valid) {
            if (sc.hasNext()) {
                email = sc.next();
                valid = true;
            } else {
                System.out.println("Bitte gib eine gültige Emailadresse ein: 2");
            }
            sc.nextLine();
        }

        return email;
    }

    public static boolean emailValidation(String email) {
        String regex = "[A-Za-z0-9]+(.[A-Za-z0-9]+)*@([A-Za-z0-9].)+[A-Za-z0-9]+";
        return email.matches(regex);
    }
}
