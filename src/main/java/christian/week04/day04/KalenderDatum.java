package christian.week04.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class KalenderDatum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        wannUndWo();
//        String Tag = geburtstagsTagAusgebenWithDateClass();
//        System.out.println(Tag);
//        geburtstagsTagAusgebenWithCalendarClass();
//        System.out.println(wannIstSontag());
        System.out.println(wievieleSonntageInMonatX(2021, 9));
        System.out.println(wievieleArbeitsTageInJahrUndMonatX(2024, 3));

    }

    public static void wannUndWo() {
        Date now = new Date();
        System.out.println(now);
        System.out.println();

        System.out.println("Nur das Datum:");
        DateFormat dateformatDatum = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateformatDatum.format(now));
        System.out.println();

        System.out.println("Nur die Uhrzeit:");
        DateFormat dateformatUhrzeit = new SimpleDateFormat("HH:mm");
        System.out.println(dateformatUhrzeit.format(now));
        System.out.println();

        System.out.println("Datum und Uhrzeit:");
        DateFormat dateformatDatumUndUhrzeit = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(dateformatDatumUndUhrzeit.format(now));
        System.out.println();

        System.out.println("Datum und Uhrzeit und Zeitzone:");
        System.out.println(dateformatDatumUndUhrzeit.format(now) + " " + dateformatDatumUndUhrzeit.getTimeZone().toZoneId());
        System.out.println();

        System.out.println("Millisekunden seit 1970:");
        System.out.println(now.getTime());
        System.out.println();
    }


    public static String geburtstagsTagAusgebenWithDateClass() {
        System.out.println("Gib deinen Geburtstag in folgendem Format ein: DD.MM.YYYY");


        DateFormat dateformatDatum = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat dateformatTag = new SimpleDateFormat("EEEE");

        Date geburtsDatum = null;
        boolean valid = false;

        while (!valid)
            try {
                String geburtstag = sc.nextLine();
                geburtsDatum = dateformatDatum.parse(geburtstag);
                valid = true;
            } catch (ParseException pe) {
                System.out.println("Ungültige Eingabe!");
            }

        System.out.println("Dein Geburtstag war ein: " + dateformatTag.format(geburtsDatum));

        String geburtstagTAg = dateformatTag.format(geburtsDatum);
        return geburtstagTAg;
    }

    public static void geburtstagsTagAusgebenWithCalendarClass() {
        System.out.println("Gib deinen Geburtstag in folgendem Format ein: DD.MM.YYYY");

        Calendar kalender = null;
        DateFormat datumFormat = new SimpleDateFormat("dd.MM.yyyy");

        while (kalender == null) {
            try {
                String geburtstag = sc.nextLine();
                Date datum = datumFormat.parse(geburtstag);
                kalender = Calendar.getInstance();
                kalender.setTime(datum);
            } catch (ParseException pe) {
                System.out.println("Ungültige Eingabe!");
            }
        }

        System.out.println(kalender.get(Calendar.DAY_OF_WEEK));

        //einfacher mit Array und Index day_of_week
//        String[] days = {"Sonntag", "Montag"};

        switch (kalender.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("Sonntag");
                break;
            case 2:
                System.out.println("Montag");
                break;
            case 3:
                System.out.println("Dienstag");
                break;
            case 4:
                System.out.println("Mittwoch");
                break;
            case 5:
                System.out.println("Donnerstag");
                break;
            case 6:
                System.out.println("Freitag");
                break;
            case 7:
                System.out.println("Samstag");
                break;
        }
    }

    public static String wannIstSontag() {


        Calendar kalender = Calendar.getInstance();

        while (kalender.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            kalender.add(Calendar.DAY_OF_MONTH, 1);
        }
        return kalender.getTime().toString();
    }

    public static int wievieleSonntageInMonatX(int jahr, int monat) {
        int sum = 0;

        Calendar kalender = Calendar.getInstance();

        kalender.set(jahr, monat - 1, 1);

        while (kalender.get(Calendar.MONTH) == monat - 1) {

            if (kalender.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sum += 1;
            }
            kalender.add(Calendar.DAY_OF_MONTH, 1);
        }

        return sum;
    }

    public static int wievieleArbeitsTageInJahrUndMonatX(int jahr, int monat) {
        int sumOfWorkdays = 0;
        LocalDate datum = LocalDate.of(jahr, monat, 1);
        while (datum.getMonthValue() == monat) {
            if (datum.getDayOfWeek().getValue() < 6) {
                sumOfWorkdays += 1;
            }
            datum = datum.plusDays(1);

        }
        return sumOfWorkdays;
    }


    public static LocalDate datumEingabe() {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Gib dein Geburtsdatum in folgendem Format ein: 31.12.2020");
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        LocalDate geburtsDatum = null;

        while (!valid) {

            try {
                String userInput = sc.nextLine();
                geburtsDatum = LocalDate.parse(userInput, dateFormat);
            }
            catch(DateTimeParseException dtpe)
            {
                System.out.println("Bitte gib das Datum im korrekten Format ein!");
            }
        }
        return geburtsDatum;
    }

//    public static int alterInTagen(Date datum) {
//
//    }


}

//Date t = new Date();
////t.getYear()
//
//        System.out.println("Daylight: "+TimeZone.getDefault().getDSTSavings());
//
//Date now = new Date();
//
//
//        System.out.println("Now in daylight saving: "+TimeZone.getDefault().inDaylightTime(now));
//
//Calendar c = Calendar.getInstance();
//        c.add(Calendar.MONTH, 1);
//        System.out.println("One month later in daylight saving: "+TimeZone.getDefault().inDaylightTime(c.getTime()));
//
//
//LocalDateTime t1 = LocalDateTime.now();
//        System.out.println(t1);
//t1 = t1.plus(1, ChronoUnit.HOURS).plusDays(10).plusDays(5);
//        System.out.println(t1);

