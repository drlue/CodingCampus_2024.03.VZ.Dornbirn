package irem.week04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class MeinBDay {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Bitte geben Sie Ihren Geburtstag im Format dd.MM.yyyy ein: ");
        String inputDate = sc.nextLine();

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(inputDate));
            String weekday = new SimpleDateFormat("EEEE", Locale.GERMAN).format(calendar.getTime());

            System.out.println("Ihr Geburtstag war ein " + weekday + ".");
        } catch (ParseException e) {
            System.out.println("Das eingegebene Datum ist ungültig. Bitte versuchen Sie es erneut mit dem Format dd.MM.yyyy.");
        }
    }
}
