package aki.week04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WannUndWo {
    public static void main(String[] args) {

        Date now = new Date();
        //Datum    |   Date
        System.out.println("=======================================");
        DateFormat formatDatum = new SimpleDateFormat("EEEE, dd/ MMMM/ yyyy");
        System.out.println("Datum: " + formatDatum.format(now));
        System.out.println("=======================================");

        //Uhrzeit   |   Time
        DateFormat formatUhrzeit = new SimpleDateFormat("HH:mm");
        System.out.println("Uhrzeit: " + formatUhrzeit.format(now));
        System.out.println("=======================================");

        //Datum und Uhrzeit zusammen    |   Date and Time added together
        System.out.println(formatDatum.format(now) + " | " + formatUhrzeit.format(now));
        System.out.println("=======================================");

        //Zeitraum mit Datum und Uhreit  |   Timezone with Date and Time added together
        DateFormat timeZone = new SimpleDateFormat("z");
        System.out.println(formatDatum.format(now) + " | " + formatUhrzeit.format(now) + " | " + timeZone.format(now));
        System.out.println("=======================================");

        //Sekunde mit Millisekund    |Seconds with Milliseconds
        DateFormat secondsAndMilliSeconds = new SimpleDateFormat("ss:SSS");
        System.out.println("Sekunde und Millisekunde: " + secondsAndMilliSeconds.format(now));
        System.out.println("=======================================");
    }
}