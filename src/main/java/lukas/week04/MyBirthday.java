package lukas.week04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MyBirthday {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Date myDate = getInputDate();
        String prefix = "Der " + (new SimpleDateFormat("dd.MM.yyyy").format(myDate)) + " war ein";
        //Version 1
        System.out.println(prefix + " " + getDayOfWeek(myDate) + ".");
        //Version 2
        System.out.println(prefix + " " + getDayOfWeekCalendar(myDate) + ".");
        //Version 3
        System.out.println(prefix + " " + getDayOfWeekWithTimeClass(myDate) + ".");

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
        System.out.println(dayNr + " und erster Tag = " + firstDayNr);

        //Problem: DayOfWeekEnum beginnt mit Montag, aber DAY_OF_WEEK (Sunday = 1)
//        int dayIndex = 0;
//        if (dayNr > firstDayNr) {
//            dayIndex = dayNr - firstDayNr;
//        } else {
//            dayIndex = 7 - firstDayNr + dayNr;
//        }

        int dayIndex = (dayNr+7-firstDayNr) % 7;
        //firstDay = 2 -> (dayNr + 5) % 7
        System.out.println(dayIndex);
        return DayOfWeek.values()[dayIndex].getDisplayName(TextStyle.FULL, Locale.GERMAN);

    }


}
