package samet.week04.day05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Birthday?");
        String input = scanner.nextLine();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
/*
        try {
            Date parsedDate = format.parse(input);
            Date currentDate = new Date();

            long ageInMillis = currentDate.getTime() - parsedDate.getTime();
            long ageInDays = ageInMillis / (1000 * 60 * 60 * 24);
            int years = (int) (ageInDays / 365);
            int remainingDays = (int) (ageInDays % 365);
            System.out.println("You are " + years + " Years and " + remainingDays + " days old");
        } catch (
                ParseException e) {
            System.err.println("Die eingabe war ungültig! " + e.getMessage());

        }*/

        try {
            Date birthDate = format.parse(input);
            Date currentDate = new Date();

            Calendar birthCal = Calendar.getInstance();
            birthCal.setTime(birthDate);
            Calendar currentCal = Calendar.getInstance();
            currentCal.setTime(currentDate);

            int years = currentCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
            birthCal.set(Calendar.YEAR, currentCal.get(Calendar.YEAR));

            if (currentCal.before(birthCal)) {
                years--;
                birthCal.add(Calendar.YEAR, -1);
            }

            int daysInYear = currentCal.get(Calendar.DAY_OF_YEAR) - birthCal.get(Calendar.DAY_OF_YEAR);

            System.out.println("Ihr Alter beträgt " + years + " Jahre und " + daysInYear + " Tage.");
        } catch (ParseException e) {
            System.out.println("Ungültiges Datumsformat. Bitte geben Sie das Datum im Format (TT-MM-JJJJ) ein.");
        }

    }
}

