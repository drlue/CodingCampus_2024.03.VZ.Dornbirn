package irem.HU;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AufgabeKalender {
    static Calendar cal = Calendar.getInstance();

        public static void main(String[] args) {
            // Definiere das gewünschte Format für das Datum
            SimpleDateFormat sdf = new SimpleDateFormat("EE dd.MM.yyyy");

            // Formatierung des aktuellen Datums gemäß dem definierten Format und Ausgabe
            System.out.println(sdf.format(cal.getTime()).toUpperCase());
        }
    }

