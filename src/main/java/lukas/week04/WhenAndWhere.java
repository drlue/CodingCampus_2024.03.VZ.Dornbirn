package lukas.week04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class WhenAndWhere {


    public static Calendar cal = Calendar.getInstance();

    public static void main(String[] args) {

        //1. Print Date
        printDate();
        printTime();
        printDateTime();
        printDateTimeZone(null);
        printDateTimeZone("GMT");
        printDateTimeZone("EST");
        printDateTimeZone("America/New_York");
        printDateTimeZone("Asia/Shanghai");
        printDateTimeZone("Australia/Sydney");
        printSecond();
        printDateToString();
    }


    public static void printDate() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.printf("%-50s %s\n", "Datum: ", df.format(date));

    }

    public static void printTime() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        System.out.printf("%-50s %s\n", "Uhrzeit: ", df.format(date));

    }

    public static void printDateTime() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd.MM.yy, HH:mm:ss");
        System.out.printf("%-50s %s\n", "Datum, Uhrzeit: ", df.format(date));
    }

    public static void printDateTimeZone(String timeZoneID) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd.MM.yy, HH:mm:ss, z");
        if (timeZoneID != null) {
            df.setTimeZone(TimeZone.getTimeZone(timeZoneID));
        }
        System.out.printf("%-50s %s\n", "Datum, Uhrzeit, Zeitzone" + (timeZoneID != null ? " (" + timeZoneID + ")" : "") +":", df.format(date));
    }

    public static void printSecond() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("ss's' SS'ms'");
        System.out.printf("%-50s %s\n", "Aktuelle Sekunde und Millisek.: ", df.format(date));
    }

    public static void printDateToString() {
        Date date = new Date();
        System.out.printf("%-50s %s\n", "Standard print date.toString: ", date);
    }

}
