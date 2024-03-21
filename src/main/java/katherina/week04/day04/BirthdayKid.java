package katherina.week04.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class BirthdayKid {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] errorMessages = new String[]{
                "Hasi, dein Geburtstag ist doch wohl hoffenlich eine Ganzzahl. Also gib gefälligst auch eine ein.",
                "Mausi, willst du mich ärgern? Glaub mir, das klappt nicht. Schreib eine Ganzzahl hin!",
                "Also. Ich erkläre das jetzt ganz leicht verständlich: Du schreibst die Antwort mit Zahlen. Die Dingsis auf deinem Nummernblock. Deal? Deal.",
                "Ich will ja wirklich keine Capslock nutzen müssen, aber WEIẞT DU SCHON, was eine Ganzzahl ist?!?!?!"
        };
        Calendar calendar = Calendar.getInstance();

        System.out.println("Bitte gib dein Geburtsdatum im Format 'Tag'.'Monat'.'Jahr' ein! Beispielsweise: 09.01.2011");
        String input = sc.nextLine();
        DateFormat dataformat = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat dataformat2 = new SimpleDateFormat("EEEEEEEEE");
        try {
            Date parsedDate = dataformat.parse(input);
            System.out.println("Du hast das Datum " + dataformat.format(parsedDate) + " eingegeben.");
            System.out.println("Dieses Datum war an einem " + dataformat2.format(parsedDate));

            //getDayString(input);
        } catch (ParseException e) {
            int errorMessageIndex = new Random().nextInt(errorMessages.length);
            System.out.println(errorMessages[errorMessageIndex]);
          //  System.err.println("Hasi, dein Geburtstag besteht doch wohl hoffenlich aus Ganzzahlen. Also gib gefälligst auch welche ein." + e.getMessage());
        }
    }
}