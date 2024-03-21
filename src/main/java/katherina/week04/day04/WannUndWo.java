package katherina.week04.day04;

//Die aktuelle Sekunde mit Millisekunde


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WannUndWo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
    //    System.out.println(calendar);

        Date today = new Date();
        System.out.println(today);

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Heute ist: "+format.format(today));

        System.out.println();

        DateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Wir haben diese Uhrzeit: "+format2.format(today));

        System.out.println();

        DateFormat format3 = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
        System.out.println("Datum und Uhrzeit: "+format3.format(today));

        System.out.println();

        DateFormat format4 = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss, z");
        System.out.println("Datum, Uhrzeit und Zeitzone: "+format4.format(today));

        System.out.println();

        DateFormat format5 = new SimpleDateFormat("ss, SS");
        System.out.println("Sekunde und Milisekunde in genau ... diesem Moment: "+format5.format(today));
    }

}
