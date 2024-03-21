package lukas.week04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestUml {
    public static void main(String[] args) {
        String txt = "Österreich";
        System.out.println(txt.length());


        Date now = new Date();
        DateFormat df = new SimpleDateFormat("EEEE", new Locale("sw"));
        System.out.println(df.format(now));

        Calendar cal = Calendar.getInstance();
        Calendar cal2 = new GregorianCalendar();

        System.out.println(cal.getTime());


        for (int i = 1; i < 9; i++) {
            System.out.printf("i=%d  j=%d\n", i, (i+7-2) % 7);
        }

    }


}


