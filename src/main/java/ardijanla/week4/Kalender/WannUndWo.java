package ardijanla.week4.Kalender;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;

//Aufgabe: Wann und wo?
//Erstelle ein Programm, das das aktuelle Datum und die Uhrzeit ausgibt. Verwende für jede unten angegebene ausgabe ein eigenes SimpleDateFormat und erstelle eine 3 Zeilige Ausgabe:
//
//Nur das Datum
//Nur die Uhrzeit
//Datum und Uhrzeit
//Datum und Uhrzeit mit Zeitzone
//Die aktuelle Sekunde mit Millisekunde
public class WannUndWo {
    public static void main(String[] args) {
        String pattern;
        String date;
        SimpleDateFormat formatter;

        //Nur das Datum
        pattern = "dd-MM-yyyy";
        formatter = new SimpleDateFormat(pattern);
        date = formatter.format(new Date());
        System.out.println(date);

        //Nur die Uhrzeit
        pattern = "kk:mm:ss";
        formatter = new SimpleDateFormat(pattern);
        date = formatter.format(new Date());
        System.out.println(date);

        //Datum und Uhrzeit
        pattern = "dd-MM-yyyy kk:mm:ss";
        formatter = new SimpleDateFormat(pattern);
        date = formatter.format(new Date());
        System.out.println(date);

        //Datum und Uhrzeit mit Zeitzone
        pattern = "dd-MM-yyyy kk:mm:ss z";
        formatter = new SimpleDateFormat(pattern);
        date = formatter.format(new Date());
        System.out.println(date);

        //Die aktuelle Sekunde mit Millisekunde
        pattern = "ss:SSS";
        formatter = new SimpleDateFormat(pattern);
        date = formatter.format(new Date());
        System.out.println(date);
    }
}
