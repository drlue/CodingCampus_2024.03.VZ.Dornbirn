package samet.week04.day04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class DateWannUndWo {

    public static void main(String[] args) {

//        Calendar calendar = Calendar.getInstance();

        Date now = new Date();
        System.out.println(now);


        DateFormat format = new SimpleDateFormat("dd.MM");
        System.out.println(format.format(now));

        DateFormat format1 = new SimpleDateFormat("HH:mm");
        System.out.println(format1.format(now));

        DateFormat format2 = new SimpleDateFormat("dd.MM HH:mm");
        System.out.println(format2.format(now));

        DateFormat format3 = new SimpleDateFormat("dd.MM HH:mm z");
        System.out.println(format3.format(now));

        DateFormat format4 = new SimpleDateFormat("s:S");
        System.out.println(format4.format(now));



    }
}
