package franco.week04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class WhenAndWhere {

    public static void main(String[] args) {
        Calendar calend = Calendar.getInstance();
        System.out.println(calend);

        Date maintenant = new Date();
        System.out.println("The date today is " + maintenant);
        System.out.println("let see " + maintenant.getTime());
        double seconds = maintenant.getTime() / 1000;
        double minutes = seconds/60;
        double hours = minutes/60;
        double days= hours/24;
        double months= days/30;
        double years= months/12;
        double acqYears= days/365;
        System.out.println("Since 00:00:00 of Jan. 1. 1970. it's been...");
        System.out.println(seconds+" seconds OR");
        System.out.println(minutes+" minutes OR");
        System.out.println(hours+" hours OR");
        System.out.println(days+" days OR");
        System.out.println(months+" months OR");
        System.out.println(years+" years!!!");
        System.out.println(acqYears+" years more accurate!!!");

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(format.format(maintenant)+" is now in format dd.MM.yyyy");

        DateFormat formatAcc= new SimpleDateFormat("KK:mm:ss");
        System.out.println(formatAcc.format(maintenant)+ " the actual time!");

        DateFormat formatDay= new SimpleDateFormat("EEEE MMMM yyyy");
        System.out.println(formatDay.format(maintenant)+" Simple try out!");

        DateFormat formatTimeZone= new SimpleDateFormat("dd.MM.yyyy KK:mm:ss zzzz");
        System.out.println(formatTimeZone.format(maintenant)+" the actual formatted time with time zone included!");

        DateFormat format4 = new SimpleDateFormat("ss. S ");
        System.out.println(format4.format(maintenant) + " the current second with milliseconds");







    }
}
