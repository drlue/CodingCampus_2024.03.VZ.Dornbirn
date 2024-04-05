package irem.Uebungen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AlterRausfinden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aufforderung
        System.out.println("Bitte geben Sie Ihr Geburtsdatum ein (dd-MM-yyyy):");
        String input = scanner.nextLine();

        // Format für das Datum
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthDate = sdf.parse(input); // Verarbeitung der Eingabe
            calculateAge(birthDate); // Berechnung und Ausgabe des Alters
        } catch (ParseException e) {
            System.out.println("Das Datum wurde nicht im richtigen Format eingegeben.");
        }
    }

    public static void calculateAge(Date birthDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();

        int years = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        int months = today.get(Calendar.MONTH) - birth.get(Calendar.MONTH);
        int days = today.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH);

        // wenn der heutige Tag im Jahr vor dem Geburtstag liegt
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }
        // Berechnung der Gesamttage zwischen heute und dem Geburtstag
        long totalDays = (today.getTimeInMillis() - birth.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        System.out.println("Sie sind " + years + " Jahre und insgesamt " + totalDays + " Tage alt.");
    }
}

