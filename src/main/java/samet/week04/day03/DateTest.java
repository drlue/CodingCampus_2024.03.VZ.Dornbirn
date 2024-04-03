package samet.week04.day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateTest {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        Date inOneHoureFromNow = new Date(System.currentTimeMillis() + 60 * 60 * 1000);
        System.out.println(inOneHoureFromNow);

        DateFormat format = new SimpleDateFormat("HH");
        System.out.println(format.format(inOneHoureFromNow));

        //String einlesenin der Form Tag.Monat.Jahr Stunde(0-23):Minute


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Datum in Format Tag.Monat.Jahr Stunde:Minute ein!");
        String input = scanner.next();


    }
}
