package ardijanla.week4.Kalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MeinGeburtstag {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String input = "13.08.2000";
        try {
            // Bestimme den Wochentag des Geburtstags
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            String weekday = dayFormat.format(dateFormat.parse(input));

            System.out.println("Dein Geburtstag war ein: " + weekday);
        } catch (ParseException e) {
            System.out.println("Das Format des Datums ist ungültig. Bitte im Format dd-MM-yyyy eingeben.");
        }


    }
}
