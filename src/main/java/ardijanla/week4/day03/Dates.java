package ardijanla.week4.day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println(now);

        Date inOneHour = new Date(System.currentTimeMillis() + 60 * 60 * 1000 );
        System.out.println(inOneHour);
        DateFormat format = new SimpleDateFormat("hh");
        System.out.println(format.format(inOneHour));


        String temp = "Ä";
        System.out.println(temp.length());
        
    }
}
