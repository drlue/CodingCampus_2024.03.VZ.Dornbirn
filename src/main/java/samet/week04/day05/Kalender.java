package samet.week04.day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Kalender {

    public static void main(String[] args) {

        test();
    }

    public static void test() {
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM yyyy");
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.MARCH, 01);

        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH);

        System.out.println("Aktueller Monat: " + monthFormat.format(calendar.getTime()));
        System.out.println("|  Mo |  Di |  Mi |  Do |  Fr |  Sa |  So |");

        calendar.set(Calendar.DAY_OF_MONTH, 1); // Setzt den Kalender auf den ersten Tag des aktuellen Monats

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Leerzeichen für die Tage vor dem ersten Tag des Monats
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("     ");
        }

        // Ausgabe der Tage im Monat mit Markierung des heutigen Tages
        for (int i = 1; i <= daysInMonth; i++) {
            if (i == currentDay && currentMonth == calendar.get(Calendar.MONTH)) {
                System.out.printf("   %2d*", i); // Markiere den heutigen Tag
            } else {
                System.out.printf("   %2d", i);
            }

            // Neue Zeile für den Beginn einer neuen Woche
            if ((i + firstDayOfWeek - 2) % 7 == 0 || i == daysInMonth) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
