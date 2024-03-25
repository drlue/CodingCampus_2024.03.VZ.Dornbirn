package lukas.week04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MyBirthday {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Date myDate = getInputDate();
        String myDateString = new SimpleDateFormat("dd.MM.yyyy").format(myDate);
        String prefix = "Der " + myDateString + " war ein";
        //Version 1
        System.out.println(prefix + " " + getDayOfWeek(myDate) + ".");
        //Version 2
        System.out.println(prefix + " " + getDayOfWeekCalendar(myDate) + ".");
        //Version 3
        System.out.println(prefix + " " + getDayOfWeekWithTimeClass(myDate) + ".");

        //*******************************************************
        //
        //          variants mit LocalDate
        //
        //*******************************************************

        LocalDate myLocalDate = getLocalDate(myDateString);
        System.out.println("=".repeat(30) + "  Ausgabe mit LocalDate  " + "=".repeat(30));
        System.out.println(prefix + " " + getDayOfWeekLd(myLocalDate));
        System.out.println(prefix + " " + getDayOfWeekLdV2(myLocalDate));



    }

    public static Date getInputDate() {
        Date date = new Date();
        boolean isValidDate = false;
        while (!isValidDate) {
            System.out.println("Gib dein Geburtsdatum ein (zB: 10.04.1977) >>>");
            String input = sc.nextLine();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            try {
                date = df.parse(input);
                isValidDate = true;
            } catch (ParseException e) {
                System.out.println("Eingegebenes Datum nicht gültig!");
            }
        }
        return date;
    }

    public static String getDayOfWeek(Date date) {
        DateFormat df = new SimpleDateFormat("EEEE");
        return df.format(date);
    }


    public static String getDayOfWeekCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayNr = cal.get(Calendar.DAY_OF_WEEK);
        int firstDayNr = cal.getFirstDayOfWeek();
        return daysOfWeekGerman[dayNr - firstDayNr + 1];
    }

    public static String[] daysOfWeekGerman = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

    public static String getDayOfWeekWithTimeClass(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayNr = cal.get(Calendar.DAY_OF_WEEK);
        int firstDayNr = cal.getFirstDayOfWeek();
        //System.out.println(dayNr + " und erster Tag = " + firstDayNr);


        int dayIndex = (dayNr + 7 - firstDayNr) % 7;
        // dayNr = 1:  (7+1-2) = 6 % 7 = 6  DayOfWeek.values()[6] = SUNDAY
        // dayNr = 2:  (7+2-2) = 7 % 7 = 0  DayOfWeek.values()[0] = MONDAY

        //System.out.println(dayIndex);
        return DayOfWeek.values()[dayIndex].getDisplayName(TextStyle.FULL, Locale.GERMAN);
    }


    //********************************************************************
    //
    // LocalDate - LocalTime - LocalDateTime
    //
    //********************************************************************



    public static LocalDate getLocalDate(String input) {
        LocalDate ld = null;
        boolean isValidDate = false;

        while (!isValidDate) {
            if(input == null) {
                System.out.println("LocalDateParser: Gib dein Geburtsdatum ein (zB: 10.04.1977) >>>");
                input = sc.nextLine();
            }
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            try {
                ld = LocalDate.parse(input, dtf);
                isValidDate = true;
            } catch (DateTimeException e) {
                System.out.println("Eingegebenes Datum nicht gültig!");
                input = null;
            }
        }
        return ld;
    }

    public static String getDayOfWeekLd(LocalDate localDate) {
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN);
    }

    public static String getDayOfWeekLdV2(LocalDate localdDate){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE");
        return dtf.format(localdDate);
    }

}



