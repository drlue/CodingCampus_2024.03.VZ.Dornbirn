package lukas;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Helper {

    public static Scanner sc = new Scanner(System.in);

    public static void printChars(String txt, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(txt);
        }
    }


    public static String readStringFromConsole(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static char readCharFromConsole(String message) {

        while (true) {
            System.out.println(message);
            String inputString = sc.nextLine();
            if (inputString.length() == 1) {
                return inputString.charAt(0);
            } else {
                System.out.println("Nur 1 Zeichen erlaubt");
            }
        }
    }


    public static int readIntFromConsoleV2(String message, int minValue, int maxValue) {
        while (true) {
            if (sc.hasNextInt()) {
                int result = sc.nextInt();
                if (result < minValue || result > maxValue) {
                    System.out.printf("Zahl zwischen %d und %d eingeben \n", minValue, maxValue);
                } else {
                    return sc.nextInt();
                }
            } else {
                System.out.println("Bitte eine Zahl eingeben");
            }
        }
    }

    public static int readIntFromConsoleV2(String message) {
        return readIntFromConsoleV2(message, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int readIntFromConsole(String message) {
        return readIntFromConsole(message, Integer.MIN_VALUE + 1, Integer.MAX_VALUE);
    }

    public static int readIntFromConsole(String message, int minValue, int maxValue) {
        int result = Integer.MIN_VALUE;
        while (result == Integer.MIN_VALUE) {
            System.out.print(message);
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < minValue || result > maxValue) {
                    System.out.printf("Bitte eine Zahl zwischen %d und %d eingeben \n", minValue, maxValue);
                    result = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                //System.out.println("Kennst du den Unterschied zwischen einer Zahl und einem String?");
                System.out.println("Bitte eine Zahl eingeben");
            }
        }
        return result;
    }


    public static double readDoubleFromConsole(String message) {
        return readDoubleFromConsole(message, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public static double readDoubleFromConsole(String message, double minValue, double maxValue) {
        double result = Double.NEGATIVE_INFINITY;
        while (result == Double.NEGATIVE_INFINITY) {
            System.out.print(message);
            try {
                String txtLine = sc.nextLine();
                txtLine = txtLine.replace(",", ".");
                result = Double.parseDouble(txtLine);
                if (result < minValue || result > maxValue) {
                    System.out.printf("Bitte eine Zahl zwischen %e und %e eingeben \n", minValue, maxValue);
                    result = Double.NEGATIVE_INFINITY;
                }
            } catch (NumberFormatException nfe) {
                //System.out.println("Kennst du den Unterschied zwischen einer Zahl und einem String?");
                System.out.println("Bitte eine Zahl eingeben");
            }
        }
        return result;

    }

    public static Date readDateFromConsole(String message) {
        Date date = new Date();
        boolean isValidDate = false;
        while (!isValidDate) {
            System.out.println(message);
            String input = sc.nextLine();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            try {
                date = (!input.equals("")) ? df.parse(input) : date;
                isValidDate = true;
            } catch (ParseException e) {
                System.out.println("Eingegebenes Datum nicht gültig!");
            }
        }
        return date;
    }

    public static LocalDate readLocaleDateFromConsole(String message) {
        LocalDate ld = null;
        boolean isValidDate = false;
        while (!isValidDate) {
            System.out.println(message);
            String input = sc.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            try {
                ld = LocalDate.parse(input, dtf);
                isValidDate = true;
            } catch (DateTimeException e) {
                System.out.println("Eingegebenes Datum nicht gültig!");
            }
        }
        return ld;
    }


    public static boolean isYes(String answer) {
        boolean result = false;
        boolean answerOk = false;
        while (!answerOk) {
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                answerOk = true;
                result = false;
            } else if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                answerOk = true;
                result = true;
            } else {
                answer = readStringFromConsole("y oder n eingeben!");
            }
        }
        return result;
    }

    public static String regexDoubleString =
            "^" + // accept only if it matches the beginning of the string
                    "(-?)" + // accept a single optional negation
                    "(0|([1-9][0-9]*))" + // number is either zero or some integer that does not start with zero
                    "(" + // begin optional decimals
                    "\\." + // require a dot
                    "[0-9]+" + // any digit is fine, but at least one (std::atof does not require but chrome requires digits after dot)
                    ")?" + // end optional decimals
                    "(" + // begin optional scientific exponent
                    "[eE]" + // require an e or E
                    "[-+]?" + // accept optional plus or minus
                    "[0-9]+" + // any digit is fine (tested in chrome JSON.parse(1E000003) works)
                    ")?" + // end optional scientific exponent
                    "$" // accept only if it matches up to the end of the string
            ;
}
