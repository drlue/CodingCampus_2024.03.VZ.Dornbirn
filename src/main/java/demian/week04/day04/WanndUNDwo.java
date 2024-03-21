package demian.week04.day04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WanndUNDwo {
    public static void main(String[] args) {

        // AUFGABE: Erstelle ein Programm, das das aktuelle Datum und die Uhrzeit ausgibt.
        // Verwende für jede unten angegebene ausgabe ein eigenes SimpleDateFormat und erstelle eine 3 Zeilige Ausgabe:
        //
        // Nur das Datum
        // Nur die Uhrzeit
        // Datum und Uhrzeit
        // Datum und Uhrzeit mit Zeitzone
        // Die aktuelle Sekunde mit Millisekunde


//        Date now = new Date();
//        System.out.println(now);
//        DateFormat onlydate = new SimpleDateFormat("dd.MM.yyyy");
//        System.out.println(onlydate.format(now));

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Standard Ausgabeformat: " + now);
        DateTimeFormatter formatONLYdate = DateTimeFormatter.ofPattern("dd.\nMM.\nyyyy");
        System.out.println("Datum:\n" + formatONLYdate.format(now));

        DateTimeFormatter formatONLYtime = DateTimeFormatter.ofPattern("HH:\nmm:\nss");
        System.out.println("\nUhrzeit:\n" + formatONLYtime.format(now));

        DateTimeFormatter formatDATEandTIME = DateTimeFormatter.ofPattern("dd.MM.yyyy\nHH:mm:ss");
        System.out.println("\nDatum und Uhrzeit:\n" + formatDATEandTIME.format(now));

        //MULTITHREAD BEISPIEL VON LUKAS:
//        Calendar c = Calendar.getInstance();
//        Calendar c1 = Calendar.getInstance();
//        c1.add(Calendar.HOUR, 100000);
//
//        for (int i = 0; i < 100; i++) {
//            new Thread() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 1000; j++) {
//                        synchronized (c) {
//                            c.add(Calendar.HOUR, 1);
//                        }
//                    }
//                }
//            }.start();
//        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("C:  " + c.getTime());
//        System.out.println("C1: " + c1.getTime());


    }
}
